
import java.util.*;
public class recursion2 {
   static int total =0;
    static void fun1(int n){
        if (n==0) {
            return;
            
        }
        System.out.println(n);
        total = total + n;
        fun1(n-1);
    }





    public static void main(String[] args) {
        System.out.println(" hello");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun1(n);
        System.out.println(total);
    }
}
