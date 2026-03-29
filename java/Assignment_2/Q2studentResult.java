import java.util.*;

public class Q2studentResult {
    public static void main(String[] args) {
        System.out.println("hello ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = sc.nextLine();
        System.out.print("Enter roll number : ");
        int rollno = sc.nextInt();
        int[] marks = new int[5];
        int total = 0;
        double average = 0;
        double percentage;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for " + (i + 1) + " :");
            marks[i] = sc.nextInt();
            total = total + marks[i];

        }
        average = total / 5.0;
        percentage = (total / 500.0) * 100;
        char grade;
        if (percentage > +90) {
            grade = 'A';
        } else if (percentage > +75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("--------Student Result--------");
        System.out.println("Name             :" + name);
        System.out.println("Roll number      :" + rollno);
        System.out.println("Total Marks      :" + total);
        System.out.println("Average Of Marks :" + average);
        System.out.println("Percentage       :" + percentage);
        System.out.println("Grade            :" + grade);
        if (percentage > 40) {
            System.out.println(name + " Promated ");
        } else {
            System.out.println(name + " is not Promated");

        }

    }

}
