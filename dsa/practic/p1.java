import java.util.*;

public class p1 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    static Node head = null;

    static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }
    static void addlast(int data){
        Node newNode = new Node(data);
        if ( head == null) {
            head = newNode;
            return;
            
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
            
        }
        temp.next = newNode;

    }

    static void display() {
        Node currentNode = head;
        int i =0;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            i++;
            currentNode = currentNode.next;


        }
        System.out.print("null\n");
        System.out.println("no of nodes : "+i);

    }
    static void addposition(int posi ,int data){
        Node newnode = new Node(data);
        Node currentNode = head;
       for (int i =0;i<posi-1;i++){
        currentNode = currentNode.next;
       }
       newnode.next = currentNode.next;
       currentNode.next = newnode;

    }

    static void deletefrot() {
        Node temp = head.next;
        head = temp;
    }
    static void deletelast(){
        Node temp =head;

        while (temp.next.next!=null) {
            temp = temp.next;
            
        }
        temp.next= null;

    }
    static void deletevalue(int value){
        Node temp = head; 
        while (temp.next!=null) {
            temp= temp.next;

            
        }

    }

    public static void main(String[] args) {
        addFirst(10);
        addFirst(50);
        addlast(77);
        addlast(100);
        addFirst(66);
        display();
        deletelast();
        // deletefrot();
        display();
        addposition(2, 45);
display();
    }

}
