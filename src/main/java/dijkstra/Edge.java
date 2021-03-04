package dijkstra;

public class Edge {
   private Vertex start;
    private Vertex finish;
    private int length;

    public Edge(Vertex start, Vertex finish, int length) {
        this.start = start;
        this.finish = finish;
        this.length = length;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getFinish() {
        return finish;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "start=" + start.getNumber() +
                ", finish=" + finish.getNumber() +
                ", length=" + length +
                '}';
    }
}
