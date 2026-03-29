import java.util.*;

public class Q6 {

    public static void main(String[] arg) {

        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int a = sc.nextInt();
        System.out.println("Entered number :" + a);
        if (a > 0) {
            System.out.print(a + " is Posiive number .");

        } else if (a < 0) {
            System.out.println(a + " is negative number.");

        } else
            System.out.println(a + " is zero.");

    }

}
