import java.util.*;

public class Q18 {
    public static void main(String [] arg)
{
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    int first=0;
  int   second =1;
    for(int i =1; i <=n;i++){
        System.out.print(first+" ");
        int next = first +second;
        first = second;
        second = next;
        

    }
}
    
}
