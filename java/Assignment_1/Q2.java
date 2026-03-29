import java.util.*;

public class Q2 {
    public static void main(String[] arg) {

        System.out.println("Hello");

        int num1 = 10;
        double num2 = 25;
        double sum1 = num1 + num2;
        double div = num1 / num2;
        // Type casting result to int
        int sum2=(int)sum1;


        System.out.println("Sum is            : " + sum1);
        System.out.println("DIVISION          : " + div);
        System.out.println("Casted Sum to int : "+sum2);
    }

}
