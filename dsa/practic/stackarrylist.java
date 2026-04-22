import java.util.ArrayList;

public class stackarrylist {

    ArrayList<Integer> stack = new ArrayList<>();
    int max = 100;

    boolean isEmpty() {
        return stack.size() == 0;
    }

    boolean isFull() {
        return stack.size() == max;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack.add(data);
            System.out.println(data + " is added in stack");
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int removed = stack.remove(stack.size() - 1);
            System.out.println(removed + " removed from stack");
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack.get(stack.size() - 1) + " is top element");
        }
    }

    public static void main(String[] args) {
        stackarrylist s = new stackarrylist();

        s.push(20);
        s.push(50);
        s.pop();
        s.peek();
    }
}