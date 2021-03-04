
import java.lang.Math.*;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Calculator {
    double accuracy;
 Calculator(double accuracy){
     this.accuracy = accuracy;
 }
     double getArcTg(double x){
         if (x>1||x<-1||accuracy<=0) throw new IllegalArgumentException();
        double member = x;
        double sum = 0;
        for(int n=1; abs(member)>=accuracy;n++){
            member = pow(x, 2*n-1)/(2*n-1);
            sum+=n%2==0?-member:member;
        }
        return sum;
    }
}
