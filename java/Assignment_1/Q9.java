import java.util.*;

public class Q9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter operator + , - , * , /  : ");
        char b = sc.next().charAt(0);
        System.out.print("Enter Secomd number : ");
        int c = sc.nextInt();
        double result;
        switch (b) {
            case '+':
                result = a + c;

                System.out.println("Result : " + result);

                break;
            case '-':
                result = a - c;
                System.out.println("Result : " + result);
                break;
            case '*':
                result = a * c;
                System.out.println("Result " + result);
                break;

            case '/':
                result = a / c;
                System.out.println("Result : " + result);
                break;

            default:
                System.out.println("\"Invalid operator! Please use +, -, *, or /.\"");
                break;
        }

    }

}
