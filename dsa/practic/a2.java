import java.util.Scanner;

public class a2 {
    static class stack {
        static int max;
        static int[] arr;
        static int top = -1;

        stack(int max) {

            this.max = max;
            arr = new int[max];

        }

        static boolean isempty() {
            return top == -1;
        }

        static boolean isFull() {
            return top == max - 1;
        }

        static void push(int val) {
            if (isFull()) {
                System.out.println("stack is full");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element add in stack ");
        int max = sc.nextInt();
    }

}
