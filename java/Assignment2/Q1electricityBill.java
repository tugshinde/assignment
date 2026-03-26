import java.util.*;

public class Q1electricityBill {
    public static void main(String[] args) {
        System.out.println("hello word");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name    :");
        String name = sc.next();
        System.out.print("Enter consumer number  :");
        int cno = sc.nextInt();
        System.out.print("Enter consumed unit    :" );
        int unit = sc.nextInt();
        double bill = 0;
        System.out.println("customer name    :" + name);
        System.out.println("consumer number  :" + cno);
        System.out.println("consumed unit    :" + unit);
        if (unit < 100) {
            bill = unit * 5;
            // System.out.println("your Bill : " +bill);
        } else if (unit > 100 || unit < 200) {
            bill = 100 * 5 + ((unit - 100) * 7);
            // System.out.println("Your bill "+ bill);

        } else if (unit > 200) {
            bill = 100 * 5 + 100 * 7 + ((unit - 200) * 10);
        }
        if (bill > 1500) {
            bill = bill * 1.05;

        }
        System.out.println("Your bill is " + bill);

    }

}