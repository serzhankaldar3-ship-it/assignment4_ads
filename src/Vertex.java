public class Vertex {
    // Төбенің бірегей идентификаторы [cite: 17]
    private int id;
    public Vertex(int id) {
        this.id = id;
    }

    // Getter әдісі [cite: 20]
    public int getId() {
        return id;
    }

    // Төбені мәтін түрінде қайтару [cite: 21]
    @Override
    public String toString() {
        return "Vertex{id=" + id + "}";
    }
}