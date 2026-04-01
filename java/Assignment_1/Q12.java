import java.util.*;

public class Q12 {
    public static void main (String[] arg){
        System.out.println("Hello ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        sum=(n*(n+1))/2;
        System.out.println("Sum of n numbers : "+sum);
    }
}
