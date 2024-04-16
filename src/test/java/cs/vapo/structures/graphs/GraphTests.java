package cs.vapo.structures.graphs;

import cs.vapo.structures.stack.Stack;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GraphTests {

    @Test
    public void undirectedGraph() {
        final String expectedGraph = """
                [0,1,1,]
                [1,0,1,]
                [1,1,0,]
                """;
        final UndirectedGraph g = new UndirectedGraph(3);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);

        Assertions.assertEquals(expectedGraph, g.toString());
    }

    @Test
    public void depthFirstSearch() {
        // this graph actually has 8 vertices, but since it is not 0-indexed I'll add an element to the matrix
        final DirectedGraph d = new DirectedGraph(9);
        d.addEdge(1, 3);
        d.addEdge(3, 7);
        d.addEdge(7, 8);
        d.addEdge(3, 4);
        d.addEdge(4, 6);
        d.addEdge(6, 2);
        d.addEdge(2, 5);
        d.addEdge(1, 2);
        d.addEdge(7, 4);

        final Stack<Integer> stack = new Stack<>();
        final Set<Integer> visited = new HashSet<>();
        stack.push(1);
        while (!stack.isEmpty()) {
            // visit node only if not visited yet
            final Integer currentNode = stack.pop();
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                final List<Integer> adjacentNodes = d.getNodeEdges(currentNode);
                System.out.printf("Visiting %s , adjacent nodes: %s%n", currentNode,
                        Arrays.toString(adjacentNodes.toArray()));
                for (Integer i : adjacentNodes) {
                    stack.push(i);
                }
            }
        }
    }
}
