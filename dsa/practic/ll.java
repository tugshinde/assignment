import java.util.*;

public class ll {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void addFirst(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;

        }
        newnNode.next = head;
        head = newnNode;

    }

    static void addlast(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;

        }
        currentNode.next = newnNode;

    }

    static void display() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        // ll listof = new ll();
        // listof.addFirst("vaibhav");
        // listof.addFirst("vaibhav");listof.addFirst("vaibhav");
        // listof.display();
        addFirst("vaibhav");
        display();
    }

}
