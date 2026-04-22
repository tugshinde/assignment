import java.util.*;

public class Q11 {



    void calculate(int a , int b){
        int c = a+b;
        System.out.println("sum of int + int : "+c);
    }
    void calculate(double a , double b){
        double c = a+b;
        System.out.println("sum of double + double  : "+c);
    }
    void calculate(int a , int b,int d ){
        int c = a+b+d ;
        System.out.println("sum of int + int + int  : "+c);
    }

    public static void main(String [] arg){

        // Scanner sc = new Scanner(System.in);
        Q11 s1 =new Q11();
        s1.calculate(2,3 );
        s1.calculate(22,25);
        s1.calculate(2, 3, 4);


    }
    
}
