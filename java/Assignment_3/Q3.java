
// package java.Assignment_3;
import java.util.*;

class Account {
    static int total = 0;
    String number;
    String name;
    double balance;

    Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        total++;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

        } else
            System.out.println("Enter vaild amount");
    }

    void deposit(double amount, String mode) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Balance updated successfully by mode " + mode);

        } else
            System.out.println("Enter vaild amount");
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance = balance - amount;
            System.out.println(amount + " Withdraw successfully and updated balance : " + balance);

        } else
            System.out.println("Amount should be more than balance :");
    }

    void display() {
        System.out.println("Account number      : " + number);
        System.out.println("Account holder Name : " + name);
        System.out.println("Balance             : " + balance);

    }
}

public class Q3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello");
        System.out.print("Enter how many account : ");

        int n = sc.nextInt();

        Account[] a = new Account[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for account " + (i + 1));
            sc.nextLine();

            System.out.print("Enter account number : ");
            String number = sc.nextLine();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter Balance : Rs");
            double balance = sc.nextDouble();
            a[i] = new Account(number, name, balance);

        }

        // for (Account f : a){
        // System.out.println("");
        // f.display();
        // }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Account details for account " + (i + 1));
            a[i].display();
        }
        for (Account g : a) {
            System.out.println("\nOperations for account no : " + g.number);
            System.out.print("Enter amount for deposite in bank account : Rs");
            double amount1 = sc.nextDouble();
            g.deposit(amount1);
            System.out.print("Enter amount for deposite in bank account by online  : Rs");
            double amount2 = sc.nextDouble();
            g.deposit(amount2, "Online ");
            System.out.print("Enter amount to get withdraw : Rs");
            double amount3 = sc.nextDouble();
            g.withdraw(amount3);
            g.display();

        }
        System.out.println("Total account created " + Account.total);
    }

}
