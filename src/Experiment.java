import java.util.Random;

public class Experiment {
    public static void runTraversals(Graph g, int size) {
        long start, end;

        System.out.println("\n--- Testing Graph Size: " + size + " ---");

        start = System.nanoTime(); // [cite: 68]
        g.bfs(0);
        end = System.nanoTime(); // [cite: 69]
        System.out.println("\nBFS Time: " + (end - start) + " ns");

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();
        System.out.println("\nDFS Time: " + (end - start) + " ns");
    }

    public static Graph createRandomGraph(int size) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) g.addVertex(new Vertex(i));

        Random r = new Random();
        for (int i = 0; i < size * 2; i++) {
            g.addEdge(r.nextInt(size), r.nextInt(size));
        }
        return g;
    }
}