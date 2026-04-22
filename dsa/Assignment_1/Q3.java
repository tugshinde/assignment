import java.util.Scanner;

public class Q3 {
    public static String reverse(String str){
        if (str.isEmpty()) {
            return str;
            
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
       System.out.println( reverse(s));
       

    }
}
