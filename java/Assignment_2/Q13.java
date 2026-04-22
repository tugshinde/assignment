import java.util.*;

class bankaccount {

    String accountno;
    String name;
    double balance;

    bankaccount() {
        this.accountno = "not assigned ";
        this.name = "Null";
        this.balance = 0;

    }

    bankaccount(String accountno, String name, double balance) {
        this.accountno = accountno;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account no of customer : " + accountno);
        System.out.println("Name  of customer      : " + name);
        System.out.println("Balance amount         : Rs " + balance);
    }
}

public class Q13 {

    public static void main(String[] args) {

        bankaccount b1=new bankaccount();
        bankaccount b2 = new bankaccount("HDFC202219", "Vaibhva Ghadge", 10000);
        bankaccount b3 = new bankaccount("SBIN0012480","Rushikesh khedar",200000);
        b1.display();
        b2.display();
        b3.display();
    }

}
