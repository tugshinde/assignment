import java.util.*;


public class Q1 {
    static int factorial(int n ){
        if (n<0) {
            System.out.println("Negative number ");

            return -1;
        }
        if (n==0 || n==1) {
            return 1;
            
        }
        else 
        return n * factorial(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =factorial(n);
        System.out.println(result);
        
    }
    
}
