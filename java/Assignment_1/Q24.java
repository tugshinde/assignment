
import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestDigit = 0;

        if (num == 0) {
            largestDigit = 0;
        }

        while (num > 0) {
            int currentDigit = num % 10; 
            if (currentDigit > largestDigit) {
                largestDigit = currentDigit;
            }
            num = num / 10; 
        }

        System.out.println("The largest digit is: " + largestDigit);

    }
}