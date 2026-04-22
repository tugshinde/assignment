public class p10 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    static void insertfirst(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        } else
            newnode.next = head;
        head = newnode;

    }

    static void insertlast(int val){
        Node newnode = new Node(val)
        if (head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next= newnode;

    }

    static void insertposition(int posi, int val) {
        Node newnode = new Node(val);
        Node temp = head;
        for (int i = 0; i < posi - 1; i++) {
            temp = temp.next;

        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    static void deletefirst() {
        if (head == null) {
            return;
        }
        head = head.next;

    }

    static void deletelast() {
        Node temp = head;
        if (head == null || head.next == null) {
            head = null;
            return;

        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static void deletebyval(int val) {

        if (head.data == val) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data == val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;

        }
    }

    static int search(int val) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return index;
            }
            temp = temp.next;
            index++;

        }
        return -1;
    }
    static int totalnode(){
        Node temp = head;
        int index= 1;
        while (temp!=null){
            temp= temp.next;
            index++;
        }
        



        return index;
    }
    

    public static void main(String[] arg) {
        System.out.println("Hello");

    }

}
