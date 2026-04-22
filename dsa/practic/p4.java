public class p4 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            // System.out.println("data added");
            root = new Node(val);
            return root;

        }
        if (val < root.data) {
            // System.out.println("data added");

            root.left = insert(root.left, val);
        } else
            // System.out.println("data added");
            root.right = insert(root.right, val);
        return root;

    }

    public static boolean search(Node root, int val) {
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

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // case1
            if (root.left == null && root.right == null) {
                return null;

            }
            // case 2
            if (root.left == null) {
                return root.right;

            } else if (root.right == null) {
                return root.left;
            }
            // case 3

            Node IS = inorderSuccessier(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }

    public static Node inorderSuccessier(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        int[] values = { 5, 10, 80, 9, 66, 55, 33 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);

        System.out.println(search(root, 33));
    }
}