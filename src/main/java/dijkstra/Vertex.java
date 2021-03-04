package dijkstra;

import java.util.Objects;

public class Vertex implements  Comparable<Vertex>{
    private int number;
   private int ds;
    private Vertex previous;

    Vertex(int number){
        this.number = number;
        ds = 1000000;
    }

     public int getNumber() {
         return number;
     }

     public void setDs(int ds) {
         this.ds = ds;
     }

     @Override
     public int compareTo(Vertex o) {
         return this.ds-o.ds;
     }

     public int getDs() {
         return ds;
     }

     public void setPrevious(Vertex previous) {
         this.previous = previous;
     }

     @Override
     public String toString() {
         return "Vertex{" +
                 "number=" + number +
                 ", ds=" + ds +
                 ", previous=" + (previous==null?null:previous.number) +
                 '}';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return number == vertex.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
