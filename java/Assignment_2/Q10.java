import java.util.*;

public class Q10 {
    public static void main(String[] arg) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;

        while (true) {

            System.out.println("\n --------Menu--------");
            System.out.println("1. Veg Burger   - Rs. 120");
            System.out.println("2. Cheese Pizza - Rs. 250");
            System.out.println("3. Cold Coffee  - Rs. 90");
            System.out.println("4. French Fries - Rs. 100");
            System.out.println("5. Generate Bill & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 5) {
                break;

            }

            switch (choice) {

                case 1:
                    System.out.print("Enter quantity for veg Burger : ");
                    int q1 = sc.nextInt();
                    total = total + (q1 * 120);
                    System.out.println(q1 + " Veg Burger Added to order");
                    break;
                case 2:
                    System.out.print("Enter quantity for Cheese Pizz : ");
                    int q2 = sc.nextInt();
                    total = total + (q2 * 250);
                    System.out.println(q2 + " Cheese Pizz Added to order");
                    break;
                case 3:
                    System.out.print("Enter quantity for Cold Coffee : ");
                    int q3 = sc.nextInt();
                    total = total + (q3 * 90);
                    System.out.println(q3 + " Cold Coffee Added to order");
                    break;
                case 4:
                    System.out.print("Enter quantity for French Fries : ");
                    int q4 = sc.nextInt();
                    total = total + (q4 * 120);
                    System.out.println(q4 + " French Fries Added to order");
                    break;
                case 5:
                    System.out.print("Enter quantity for French Fries : ");
                default:
                    System.out.println("You Entered invalic choice ");

            }

        }
        if (total > 0) {
            double gst = total * 0.05;
            double finalamount = total + gst;
            System.err.println("-------------Final Bill------------------ ");
            System.out.println("Total amount   : Rs. " + total);
            System.out.println("GST            : Rs. " + gst);
            System.out.println("-----------------------------------------");
            System.out.println("Amount Payable : Rs. " + finalamount);
            System.out.println("-----------------------------------------");

        }

        // System.out.println("total0" + total);

    }

}
