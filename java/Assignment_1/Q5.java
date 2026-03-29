import java.util.*;

public class Q5 {
    public static void main(String[] arg) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the charcter : ");
        char input = sc.next().charAt(0);
        char next = (char) (input + 1);
        char prev = (char) (input - 1);
        System.out.println("Previous Charcter : " + prev);
        System.out.println("Next Charcter     : " + next);

    }

}
