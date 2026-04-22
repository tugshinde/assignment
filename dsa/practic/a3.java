import java.util.*;

public class a3 {

    int max;
    int[] arr;
    int rear = -1;

    a3(int max) {
        this.max = max;
        arr = new int[max];

    }

    boolean isEmpty() {
        return rear == -1;
    }

    boolean isFull() {
        return rear == max - 1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.print("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.println("added in queue");

    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
    }

    void display() {
        if (isEmpty()) {
            return;
            
        }
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements in array");
        int max = sc.nextInt();
        a3 a = new a3(max);
        a.enqueue(10);
        a.enqueue(10);
        a.enqueue(10);
        a.enqueue(10);
        a.enqueue(10);
        a.display();
        a.dequeue();
        a.display();
        // int choice;
        // do {

        // choice = sc.nextInt();
        // switch (choice) {
        // case 1:
        // System.out.print
        // break;
        // }

        // } while (choice != 4);

    }

}
