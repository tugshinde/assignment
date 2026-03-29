import java.util.*;

public class Q10 {
    public static void main(String[] arg) {
        System.out.println("Hello");

        System.out.print("Enter the Charcter : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
                    System.out.println(c+ " is Vowel ");
        }else System.out.println(c+ " is Consonant");

    }

}
