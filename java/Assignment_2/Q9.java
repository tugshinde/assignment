import java.util.*;
// class daily{

// }

public class Q9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double[] expenses = new double[7];
        String[] days = { "Monday ", "Tuesday ", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.println("--- Enter Daily Expenses for the Week ---");
        for (int i = 0; i < expenses.length; i++) {
            System.out.print("enter expense for " + days[i] + " :");
            expenses[i] = sc.nextDouble();

        }
        // System.out.println(expenses[2]);

        double total = 0;
        int highestday = 0;
        int lowestday = 0;
        double average = 0;
        double highest = expenses[0];
        double lowest = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            total = total + expenses[i];

            // System.out.println("Total expenses for week "+total);
            if (expenses[i] > highest) {
                highest = expenses[i];
                highestday = i;

            }
            if (expenses[i] < lowest) {
                lowest = expenses[i];
                lowestday = i;

            }
            average = total / 7;
        }

        System.out.println("-----------------Weekly Expenses report----------");

        System.out.println("Total expenses for week    : Rs " + total);
        System.out.println("Average expense for a week : Rs " + average);
        System.out.println("highest expense            : Rs " + highest+ " on "+days[highestday]);
        System.out.println("Lowest expense             : Rs " + lowest+ " on "+days[lowestday]);

        
    }

}
