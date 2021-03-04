import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest {
   private Calculator calculator;
   private double accuracy;

   public CalculatorTest() {
       accuracy = 0.001;
        calculator = new Calculator(accuracy);
    }
    @Test
    public void testIlligal(){
       assertThrows(IllegalArgumentException.class, ()->calculator.getArcTg(-2));
    }
        @Test
    public void test1(){
        double answer = calculator.getArcTg(-1);
        assertEquals(answer,-Math.PI/4,accuracy);
    }
    @Test
    public void test2(){
        double answer = calculator.getArcTg(-0.9);
        assertEquals(answer,-0.733,accuracy);
    }
    @Test
    public void test3(){
        double answer = calculator.getArcTg(-0.7);
        assertEquals(answer,-0.611,accuracy);
    }
    @Test
    public void test4(){
        double answer = calculator.getArcTg(-0.5);
        assertEquals(answer,-0.464,accuracy);
    }
    @Test
    public void test5(){
        double answer = calculator.getArcTg(-0.3);
        assertEquals(answer,-0.291,accuracy);
    }
    @Test
    public void test6(){
        double answer = calculator.getArcTg(-0.1);
        assertEquals(answer,-0.1,accuracy);
    }

    @Test
    public void test7(){
        double answer = calculator.getArcTg(0);
        assertEquals(answer,0,accuracy);
    }
    @Test
    public void test8(){
        double answer = calculator.getArcTg(0.1);
        assertEquals(answer,0.1,accuracy);
    }

    @Test
    public void test9(){
        double answer = calculator.getArcTg(0.3);
        assertEquals(answer,0.291,accuracy);
    }
    @Test
    public void test10(){
        double answer = calculator.getArcTg(0.5);
        assertEquals(answer,0.464,accuracy);
    }
    @Test
    public void test11(){
        double answer = calculator.getArcTg(0.7);
        assertEquals(answer,0.611,accuracy);
    }
    @Test
    public void test12(){
        double answer = calculator.getArcTg(0.9);
        assertEquals(answer,0.733,accuracy);
    }
    @Test
    public void test13(){
        double answer = calculator.getArcTg(1);
        assertEquals(answer,Math.PI/4,accuracy);
    }

}
