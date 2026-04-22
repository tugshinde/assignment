
// package java.Assignment_3;
import java.util.*;

class Student {
    static int total;
    String rollno;
    String name;
    int[] marks;
    String phone;
    String email;

    Student(String rollno, String name, int[] marks, String phone, String email) {

        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
        this.email = email;
        total++;
    }

    Double total() {
        double sum = 0;
        for (double m : marks) {
            sum = sum + m;
        }
        return sum;
    }

    double average() {
        return (double) total() / marks.length;
    }

    void diaplay() {
        System.out.println("---------------Student Repotu Card------------");

        System.out.println("Roll No  : " + rollno);
        System.out.println("Name     : " + name);
        // System.out.println("Name    : " + name);
        System.out.println("marks :-> ");
        // for (int o : marks ){
        //     System.out.println(o);
        // }
        for(int l =0;l<marks.length;l++){
        System.out.println("Sub "+(+1)+"    : "+marks[l]);
        }
        System.out.println("phone    : " + phone);
        System.out.println("Email    : " + email);

    }

}

public class Q1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        // String d = sc.nextLine();
        System.out.print("Enter the no of Students : ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Details for "+(i+1));
            System.out.print("Enter Student Roll no   : ");
            String r = sc.nextLine();
            System.out.print("Enter Name of Student   : ");
            String a = sc.nextLine();
            System.out.print("Enter the no of subject : ");
            int sub = sc.nextInt();
            int[] marks = new int[sub];
            System.out.println("Enter Marks :");

            for (int j = 0; j < sub; j++) {
                marks[j] = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Enter Mobile no : ");
           String mno= sc.nextLine();
            System.out.print("Enter Email     : ");
          String email=   sc.nextLine();
            s[i] = new Student(r,a,marks,mno,email);
        }
        for (Student g : s){
            g.diaplay();

        }

    }

}
