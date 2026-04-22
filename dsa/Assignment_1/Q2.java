import java.util.*;

public class Q2 {

    public static int fibonacci(int n) {

        if (n < 0) {
            System.out.println("Negative number");
            return -1;
        }
        if (n == 0) {
            return 0;

        }
        if (n == 1) {
            return 1;

        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
        for(int i =0;i<=n;i++){
            System.out.print(fibonacci(i)+ " ");
        }
        

    }
}
