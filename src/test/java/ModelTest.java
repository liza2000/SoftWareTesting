import dijkstra.DijkstraShortestPath;
import dijkstra.Edge;
import model.EmotionalState;
import model.HeadActivity;
import model.Human;
import model.JawState;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ModelTest {


    @Test
    public void test(){
        Human artur = new Human();
        Human strangeMan = new Human();
        strangeMan.getArms()[0].toPeek(strangeMan.getHeads()[1]);
        strangeMan.getLegs().putOn("pult");
        strangeMan.getHeads()[0].setActivity(HeadActivity.SMILE);
        artur.toSee(1,strangeMan);
        assertEquals(JawState.DROPPED,artur.getHeads()[1].getJawState());
    }

     @Test
     public void test1(){
         Human artur = new Human();
         Human strangeMan = new Human();
         strangeMan.getArms()[0].toPeek(strangeMan.getHeads()[1]);
         strangeMan.getHeads()[0].setActivity(HeadActivity.SMILE);
         artur.toSee(1,strangeMan);
         assertEquals(JawState.NORMAL,artur.getHeads()[1].getJawState());
     }

     @Test
     public void test2(){
         Human artur = new Human();
         Human strangeMan = new Human();
         strangeMan.getArms()[0].toPeek(strangeMan.getHeads()[1]);
         strangeMan.getHeads()[0].setActivity(HeadActivity.SMILE);
         artur.toSee(1,strangeMan);
         assertEquals(EmotionalState.SHOCKED,artur.getEmotionalState());
     }
     @Test
     public void test3(){
         Human artur = new Human();
         Human strangeMan = new Human();
         artur.toSee(1,strangeMan);
         assertNotEquals(EmotionalState.SHOCKED,artur.getEmotionalState());
     }
    @Test
    public void test4(){
        Human artur = new Human();
        Human strangeMan = new Human();
        strangeMan.getArms()[0].toPeek(strangeMan.getHeads()[1]);
        strangeMan.getLegs().putOn("pult");
        artur.toSee(1,strangeMan);
        assertEquals(JawState.NORMAL,artur.getHeads()[1].getJawState());
    }

}
