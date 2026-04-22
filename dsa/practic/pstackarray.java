
import java.util.*;

public class pstackarray {
    static class stack {
        static int max;
        static int[] arr;
        static int top = -1;

        stack(int size) {
            this.max = size;
            this.arr = new int[size];

        }

        static boolean isEmpty() {
            return top == -1;
        }

        static boolean isFull() {
            return top == max - 1;
        }

        static void push(int data) {
            if (isFull()) {
                System.out.println("Statck is full ");

            } else
                top++;
            arr[top] = data;

        }
        static void pop(){
            if(isEmpty()){
                System.out.println("statck is empty");
            }
            else 
                System.out.println(arr[top]+" is removed");
            top --;
        }
        static void peek(){ if(isEmpty()){
                System.out.println("statck is empty");
            }
            else 
                System.out.println(arr[top]+" is a top");
            
        }

        static void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+ " ");

            }
            System.out.println();
        }
        static void searchbyvalue(int data){
            if (isEmpty()) {System.out.println("not found");
                
            }else
                for(int i =0;i<= top ;i++){
                   if(arr[i]==data){
                    System.out.println(i );
                   }  
                }
        }

    }

    public static void main(String[] args) {
        stack s = new stack(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("how mant elemnts you wnat  to add ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            s.push(sc.nextInt());

        } 
         s.display();
         s.searchbyvalue(3);

        s.pop();
        s.display();

    }
}
