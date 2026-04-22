import java.util.*;
public class recursion1 {
     public static  void fun(int n){
        if (n==0) {return;
            
        }
            System.out.println(n);
            fun(n-1);


        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
      
    }
}