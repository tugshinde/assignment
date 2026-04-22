import java.util.*;

public class p5 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
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

    static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (val < root.data) {
            return search(root.left, val);

        } else
            return search(root.right, val);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
    public static Node delete(Node root ,int val){
        if(root==null){
            return  null ;

        }
        else if (val>root.data){
            return delete(root.left, val);
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        root = insert(root, 10);

        int choice;
        inorder(root);
        // = sc.nextInt();
    }

}
