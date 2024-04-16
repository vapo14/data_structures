package cs.vapo.structures.graphs;

/**
 * Implements an Undirected Graph using an adjacency matrix
 */
public class UndirectedGraph {

    // I'll use a 2D array for this and fill it with 1s and 0s,
    // but you can also use booleans
    private final int[][] matrix;

    /**
     * Constructor for the matrix
     * @param vertices number of vertices in the Graph
     */
    public UndirectedGraph(final int vertices) {
        matrix = new int[vertices][vertices];
    }

    /**
     * Adds a new edge to the matrix
     * @param from the origin vertex
     * @param to the destination vertex
     */
    public void addEdge(final int from, final int to) {
        // if already added, skip
        if (matrix[from][to] == 1) {
            return;
        }
        matrix[from][to] = 1;
        matrix[to][from] = 1;
    }

    /**
     * Removes an edge from the matrix
     * @param from the origin vertex
     * @param to the destination vertex
     */
    public void removeEdge(final int from, final int to) {
        if (matrix[from][to] == 0) {
            return;
        }
        matrix[from][to] = 0;
        matrix[to][from] = 0;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (int[] ints : matrix) {
            builder.append("[");
            for (int anInt : ints) {
                builder.append(anInt).append(",");
            }
            builder.append("]");
            builder.append("\n");
        }
        return builder.toString();
    }
}


