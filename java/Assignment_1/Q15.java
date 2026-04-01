import java.util.*;
public class Q15 {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int count =0;
        if(n==0){
            count =1;
        }else {
            while (n>0) {
                n =n/10;
                count ++;

                
            }
        }
        System.out.println("Number of digits : " +count);


    }
    
}
