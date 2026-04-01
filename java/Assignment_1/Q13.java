import java.util.*;

public class Q13 {
    public static void main(String [] arg)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to print its table : ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }


    }
}
