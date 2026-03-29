
import java.util.*;
public class Q8 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int Year = sc.nextInt();
        if ((Year % 4 == 0 && Year % 100 != 0) || ( Year %400==0)) {
            System.out.println(Year + " is Leap Year.");
            
        }else System.out.println(Year +" is not leap Year");

    }
    
}
