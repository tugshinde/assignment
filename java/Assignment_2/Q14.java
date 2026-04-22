import java.util.*;

public class Q14 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary as Double :");
        double salary = sc.nextDouble();

        int intsalary = (int) salary;
        float floatsalary = (float) salary;
        double lossint= salary - intsalary;
        double lossfloat = salary - floatsalary; 
        System.out.println("-------Conversion Results--- ---");
        System.out.println("Salary as a Double : Rs " + salary);
        System.out.println("Salary as a Int    : Rs " + intsalary);
        System.out.println("Salary as a float  : Rs " + floatsalary);
        System.out.println("--------------------------------------");
        System.out.println("Loss happen in 'int' conversion  "+lossint);
          System.out.println("Loss happen in 'float' conversion  "+lossint);

    }
}
