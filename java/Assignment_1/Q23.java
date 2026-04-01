import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
      int   even=0;
        int odd =0;
        for(int i= 0;i<=n;i++){
            if (i%2==0) {
                even=even +i;
                
            }else odd = odd+i;
        }
        System.out.println("Sum of even numbers from 0 to "+n +" :"+even);
        System.out.println("Sum of odd  numbers from 0 to "+n +" :"+odd);
    }
}

