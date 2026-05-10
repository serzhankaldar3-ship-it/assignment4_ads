

public class Main {
    public static void main(String[] args) {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            Graph g = Experiment.createRandomGraph(size);
            if (size == 10) g.printGraph();
            Experiment.runTraversals(g, size);
        }
    }
}