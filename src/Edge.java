public class Edge {
    // Байланыстың басталатын және аяқталатын төбелері [cite: 24, 27, 29]
    private Vertex source;
    private Vertex destination;

    // Конструктор [cite: 31]
    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    // Getter әдістері [cite: 32]
    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    // Байланысты мәтін түрінде қайтару [cite: 33]
    @Override
    public String toString() {
        return source.getId() + " -> " + destination.getId();
    }
}