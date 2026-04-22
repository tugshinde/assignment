import java.util.*;

public class a1 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)
        this.data= data;


    }

        public static Node insert(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;

            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else
                root.right = insert(root.right, val);
            return root;

        }

        public static boolean search(Node root, int val) {
            if (root == null) {
                return false;
            }
            if (root.data == val) {
                return true;

            } else if (val < root.data) {
                return search(root.left, val);

            } else
                return search(root.right, val);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public static void preorder(Node root){
            if(root==null){
                return;

            }
            System.out.print(root.data+" ");
            preorder (root.left);
            preorder(root.right);
        }
        public static Node delete(Node root,int val){
            if()
        }

        public static void main(String[] arg) {
            System.out.println("hello");
            Scanner sc = new Scanner(System.in);
            Node root = null;
            int choice = sc.nextInt();
            do {

                switch (choice) {

                }

            } while (choice != 4);
        }

}
