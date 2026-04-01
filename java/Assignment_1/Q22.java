import java.util.*;

public class Q22 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbre : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count ==2) {System.out.println(n+ " is a prime number");
            
        }else System.out.println(n+" is not a prime number");
        System.out.println(count+ " is no of factors of "+n);
    }

}
