package cs.vapo.structures.graphs;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph {

    private final int[][] matrix;

    public DirectedGraph(final int vertices) {
        this.matrix = new int[vertices][vertices];
    }

    /**
     * Adds an edge to the graph
     * @param from source node
     * @param to destination node
     */
    public void addEdge(final int from, final int to) {
        if (matrix[from][to] == 1) return;
        matrix[from][to] = 1;
    }

    /**
     * Removes an edge form the graph
     * @param from source node
     * @param to destination node
     */
    public void removeEdge(final int from, final int to) {
        if (matrix[from][to] == 0) return;
        matrix[from][to] = 0;
    }

    /**
     * Gets the list of the connecting nodes
     * @param node current node
     * @return list of connecting nodes
     */
    public List<Integer> getNodeEdges(final int node) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix[node].length; i++) {
            if (matrix[node][i] == 1) {
                result.add(i);
            }
        }
        return result;
    }
}
