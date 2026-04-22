
import java.util.*;

class Recharge {
    void show() {
        System.out.println("\n ---Available Rearcharges Plans -----");
        System.out.println("1. Rs 199 - 28 days validity ");
        System.out.println("1. Rs 399 - 56 days validity ");
        System.out.println("1. Rs 599 - 84 days validity ");
        System.out.print("Enter a plan (1-3) :  ");

    }

    void processRecharge(int choice, String number) {
        System.out.println("Recharge confirmation ");
        System.out.println("Mobile Number : " + number);
        switch (choice) {
            case 1:
                System.out.println("Plan : Rs 199 ");
                System.out.println("Validity : 28 Days ");
                break;
            case 2:
                System.out.println("Plan : Rs 399 ");
                System.out.println("Validity : 56 Days ");
                break;
            case 3:
                System.out.println("Plan : Rs 599 ");
                System.out.println("Validity : 84 Days ");
                break;
            default:
                System.out.println("Please enter valid choice ! ");
        }

    }

}

public class Q7 {
    public static void main(String[] arg) {
        // System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        Recharge mobile = new Recharge();
        String mobileno;


        // Here we used while infinite loop for check the mobile no should ne 10 digit intiger 
        while (true) {

            System.out.print("Enter 10 digit mobile no : ");
            mobileno = sc.nextLine();
            if (mobileno.length() == 10 && mobileno.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }

        mobile.show();
        int choice = sc.nextInt();
        mobile.processRecharge(choice, mobileno);

    }

}
