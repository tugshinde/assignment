public class ciecularqueue {

    int max = 5;
    int queue[] = new int[max];
    int front = -1;
    int rear = -1;

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % max == front;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            //1st element 
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            queue[rear] = data;
            System.out.println(data + " is added in queue");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int value = queue[front];
            //one element 
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }

            System.out.println(value + " is removed");
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        System.out.print("Queue: ");

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % max;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ciecularqueue q = new ciecularqueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}