import java.util.*;
public class Q16 {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num =sc.nextInt();
        int originalnum = num;
        int reversed =0;
        while (num>0) {
            int lastdigit = num%10;
            reversed = (reversed *10)+ lastdigit;
            num = num/10;


            
        }
        System.out.println("reversed number : "+reversed);
        if (originalnum == reversed) {
            System.out.println(originalnum + " is Palindrome number. ");
            
        }else System.out.println(originalnum + " is not Palindrome number.");


    }
    
}
