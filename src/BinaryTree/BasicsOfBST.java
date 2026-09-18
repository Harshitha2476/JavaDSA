package BinaryTree;

public class BasicsOfBST {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int i) {
            this.val = i;

        }
        //siize oof the binary tree

    }
    public static void preorder(Node root){  // root ->left -> right //first do ur work n go left and right
        if(root==null)
            return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){  // left-> root -> right
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){  // left-> root -> right
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);

    }

    public static int size(Node root){
        if(root==null)
            return 0;
        return 1+size(root.left)+size(root.right);

    }
    public static int sum(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        return root.val+sum(root.left)+sum(root.right);
    }

    public static int maxi(Node root){
        if(root==null) return Integer.MIN_VALUE; //importatnt for negative nodes
        if(root.left==null && root.right==null) return root.val;
        return Math.max(root.val , Math.max(maxi(root.left),maxi(root.right)));
    }
    public  static int mini(Node root){
        if( root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return root.val;
        return Math.min(root.val, Math.min(mini(root.left),mini(root.right)));
    }
    public  static int product(Node root){
        if( root==null) return 1;
        if(root.left==null && root.right==null) return root.val;
        return root.val*product(root.left)*product(root.right);
    }
    public static  int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));

    }
    public static void display(Node root){
        if(root==null)
            return;
        System.out.print(root.val+" -> ");
        if(root.left!=null)
            System.out.print(root.left.val+" ,");
        if(root.right!=null)
            System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        display(root);
        System.out.println();
        preorder(root);
        System.out.println("Size= "+size(root));
        System.out.println("Sum= " +sum(root));
        System.out.println("Maximum= "+maxi(root));
        System.out.println("Height= "+height(root));
        System.out.println("Minimum= "+mini(root));
        System.out.println("Product = "+product(root));

        System.out.println();
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println("Inorder: ");
        inorder(root);
        System.out.println("Postorder: ");
        postorder(root);
    }
}
