public class a6 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }
    static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        else if (val<root.data){
            root.left = insert(root.left,val);
        }
        else root.right = insert(root.right,val);
        return root;

    }
    static boolean search(Node root,int val){
        if(root==null){
            return false;
        }
        else if(root.data==val){
            return true;
        }
        else if(val<root.data){
            return search(root.left, val);
        }
        else return search(root.right,val);
    }
    static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    static Node delete(Node root,int val){
        if(root==null){
            return null ;
        }if(val<root.data){
            root.left=delete(root.left, val);
        }else if (val>root.data){
            root.right = delete(root.right, val);
        }else{
            //leaf node
            if(root.right == null&& root.left== null){
                return null;
            }
            if (root.right ==null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
            Node Is = inordersucc(root.right);
            


        }
        return root;

    }
    static Node inordersucc(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;

    }
    public static void main(String[] args) {
         Node root= null;
        
    }
    
}
