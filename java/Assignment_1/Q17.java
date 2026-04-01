import java.util.*;

public class Q17 {
    public static void main (String[] arg ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        long factorial =1;
        if (n<0) {System.out.println("You entered negative number ! ");

            
        }else for(int i =1;i<=n;i++){
            factorial =factorial *i;
        }
        System.out.println("Factorial of "+n +" is "+factorial);




    }
    
}
