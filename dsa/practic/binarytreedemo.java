public class binarytreedemo {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class  binarytree{
        static int idx = -1;
           public static Node bildtree(int[] nodes ){
            idx++;
            if (nodes[idx]==-1) {
                return null;
                
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left= bildtree(nodes);
            newNode.right= bildtree(nodes);
            return newNode;


           }
    
        
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.bildtree(nodes);

        
        System.out.println(root.data);
        System.out.println(root.left.left.data);

    }

}
