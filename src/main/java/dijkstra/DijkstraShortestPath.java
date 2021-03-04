package dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
      private    HashMap<Integer,Vertex> vertexes = new HashMap<>();
       private HashMap<Integer, ArrayList<Edge>> edges = new HashMap<>();
       private PriorityQueue<Vertex> queue = new PriorityQueue<>();
       private StringBuilder whiteBox = new StringBuilder();

    public void setShortestPaths(int n){
        Vertex start = vertexes.get(n);
        start.setDs(0);
        queue.addAll(vertexes.values());
        whiteBox.append('a');
        while (!queue.isEmpty()){
            Vertex u = queue.poll();
            whiteBox.append('b');
            for (Edge e: edges.get(u.getNumber())) {
                Vertex v = e.getFinish();
                whiteBox.append('c');
                if (v.getDs()>u.getDs()+e.getLength()){
                    queue.remove(v);
                    v.setDs(u.getDs()+e.getLength());
                    v.setPrevious(u);
                    queue.add(v);
                    whiteBox.append('d');
                }
            }
        }
    }
       public void fillVertexes(int n){
            for (int i=0;i<n;i++)
                addVertex(i);
        }
      public void fillEdges(ArrayList<Edge> edges){
            edges.forEach(this::addEdge);
        }
       private void addEdge(Edge edge){
            edges.get(edge.getStart().getNumber()).add(edge);
        }
      private void addVertex(int n){
            Vertex vertex = new Vertex(n);
            edges.put(n,new ArrayList<>());
            vertexes.put(n, vertex);
        }

    public HashMap<Integer, Vertex> getVertexes() {
        return vertexes;
    }

    public HashMap<Integer, ArrayList<Edge>> getEdges() {
        return edges;
    }

    public StringBuilder getWhiteBox() {
        return whiteBox;
    }
}
