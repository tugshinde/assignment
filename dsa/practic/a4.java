import java.util.*;

public class a4 {
    int max = 100;
    int[] stack = new int[max];
    int top = -1;

    boolean isEmpty() {
        return top == -1;

    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top++;
        stack[top] = data;
        System.out.println("data added successfuly");

    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stacck is empty");

        }
        System.out.println(stack[top] + " removed");
        top--;

    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stacck is empty");

        }
        System.out.println(stack[top] + " is at top");

    }

    void display() {
        if(isEmpty()){
            System.out.println("stack is empty");

        }
        for(int i =top ;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println(" ");

    }

    public static void main(String[] arg) {
        a4 a = new a4();
        int[] arr = {  50, 60, 90, 80, 100 };
        for (int i = 0; i < arr.length; i++) {
            a.push(arr[i]);
        }

       
        a.display();
        a.pop();
         a.display();

    }

}
