import dijkstra.DijkstraShortestPath;
import dijkstra.Edge;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
 class DijkstraTest {
   private DijkstraShortestPath dsp;

    private void fillEdgesFromFile(File file){
        ArrayList<Edge> edges = new ArrayList<>();
        dsp = new DijkstraShortestPath();
        dsp.fillVertexes(8);
        FileReader fis;
        Scanner scanner;
        try {
            fis = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            return;
        }
        scanner  = new Scanner(fis);
        while (scanner.hasNextLine()){
            String[] args = scanner.nextLine().split(" ");
            for (int i = 1; i<args.length; i++){
                edges.add(new Edge(dsp.getVertexes().get(Integer.parseInt(args[0])),
                                 dsp.getVertexes().get(Integer.parseInt(args[i].split(",")[0])),
                                     Integer.parseInt(args[i].split(",")[1])));
            }
        }

        dsp.fillEdges(edges);

    }

    @Test
    void test(){
        File file = new File("F:\\3course\\Тестирование ПО\\lab1\\src\\test\\resources\\graph1");
        fillEdgesFromFile(file);
        dsp.setShortestPaths(0);
        assertEquals("abcdbcdbcdcdbcbbccbccbcc",dsp.getWhiteBox().toString());
    }

    @Test
    void test1(){
        File file = new File("F:\\3course\\Тестирование ПО\\lab1\\src\\test\\resources\\graph2");
        fillEdgesFromFile(file);
        dsp.setShortestPaths(0);
        assertEquals("abbbbbbbb",dsp.getWhiteBox().toString());
    }
    @Test
    void test2(){
        File file = new File("F:\\3course\\Тестирование ПО\\lab1\\src\\test\\resources\\graph3");
        fillEdgesFromFile(file);
        dsp.setShortestPaths(0);
        assertEquals("abcdcdcdbcdbccdccdbbccbcdbccbc",dsp.getWhiteBox().toString());
    }

}
