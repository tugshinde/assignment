import java.util.*;

public class Q15 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3];
        String[] subjects = { "Math", "Science ", "English" };
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student" + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " : ");
                marks[i][j] = sc.nextInt();

            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Student\tMath\tScience\tEnglish\tTotal\tAverage");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            // System.out.println("Marks for s" + (i + 1) + " ");
            double total = 0;
            double average = 0;
            for (int j = 0; j < 3; j++) {
                // System.out.println(" " + marks[i][j] + " ");
                total = total + marks[i][j];
            }
            average = total / 3.0;
            System.out.print("s" + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");

            }
            System.out.printf("%.0f\t%.2f\n", total, average);

        }
        System.out.println("------------------------------------------------------");

        // System.out.println("Student\tSub1\tSub2\tSub3\tTotal\tAverage");
    }

}
