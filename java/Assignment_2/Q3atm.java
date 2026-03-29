import java.util.*;

public class Q3atm {
    public static void main(String[] args) {

        System.out.println("Hello ");
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00;

        int choice;
        do {

            System.out.println("----ATM System------");
            System.out.println("1.Check Balance ");
            System.out.println("2.Deposite Money ");
            System.out.println("3.Withdraw money ");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account Balance :" + balance);

                    break;
                case 2:
                    double amt;
                    System.out.print("Enter Deposite amount : ");
                    amt = sc.nextDouble();
                    if (amt > 0) {
                        balance = balance + amt;
                        System.out.println(amt + " Deposited Successfully");

                    } else {
                        System.out.println("Envaild amount");
                    }

                    break;
                case 3:
                     double withdraw;
                    System.out.print("Enter amount for Winthdraw :  ");
                     withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw < balance) {
                        balance = balance - withdraw;

                    } else {
                        System.out.println("Enter Vaild amount");

                    }

                    break;
                case 4:
                    System.out.println("Thanks For using atm Services");
                    break;

                default:
                    System.out.println("Envaild Choice");
                    break;
            }

        } while (choice != 4);

    }

}
