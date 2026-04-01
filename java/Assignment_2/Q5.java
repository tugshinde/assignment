import java.util.*;

class Employee {
    String name;
    int id;
    double basicsalary;
    double hra, da, pf, netSalary;

    Employee(String name, int id, double basicsalary) {
        this.name = name;
        this.basicsalary = basicsalary;
        this.id = id;

        this.hra = basicsalary * 0.20;
        this.da = basicsalary * 0.10;
        this.pf = basicsalary * 0.08;
        this.netSalary = (basicsalary + hra + da) - pf;
    }

    void display() {
        System.out.println("\n=====================================");
        System.out.println("            EMPLOYEE SALARY SLIP       ");
        System.out.println("\n=====================================");
        System.out.println("Employee Name      : " + name);
        System.out.println("Employee Id        : " + id);
        System.out.println("----------------------------------------");
        System.out.println("salary             : " + basicsalary);
        System.out.println("HRA                : " + hra);
        System.out.println("DA                 : " + da);
        System.out.println("----------------------------------------");
        System.out.println("Deduction (PF)     : " + pf);
        System.out.println("----------------------------------------");
        System.out.println("Net Salary         : " + netSalary);
        System.out.println("----------------------------------------");

    }
}

public class Q5 {

    public static void main(String[] arg) {

        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Id : ");
        int id = sc.nextInt();
        System.out.print("Enter Basic Salary : ");
        double basicsalary = sc.nextDouble();
        Employee emp = new Employee(name, id, basicsalary);
        System.out.println(emp.name);
        emp.display();

    }
}
