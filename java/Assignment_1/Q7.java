import java.util.*;

public class Q7 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 :");

        int a = sc.nextInt();
         System.out.print("Enter num 2 :");

        int b = sc.nextInt();
         System.out.print("Enter num 3 :");

        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is Largest Number.");

        } else if (b > a && b > c) {
            System.out.println(b + " is Largest Number.");

        } else
            System.out.println(c + " is Largest Number.");

        System.out.println("hello");
    }

}
