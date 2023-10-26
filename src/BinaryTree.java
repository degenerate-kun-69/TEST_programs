import java.util.Scanner;
public class BinaryTree {

    private Node root;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BinaryTree Tree = new BinaryTree();
        Tree.populate(sc);
        Tree.display();
    }


    private static class Node{

        private final int val;
        private Node right;
        private Node left;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node right,Node left){
            this.val=val;
            this.right=right;
            this.left=left;
        }

      //  public Node getRight(){
        //    return right;
        //}
        //public Node getLeft(){
         //   return left;
        //}

       /* public Node setLeft(int val,Node left,Node right){
            Node.left=left;
        }
        public Node setRight(){
            Node.right=right;
        }*/
    }
    public void display(){
        display(root,"");
    }
   // private void display(Node node,String indent){
//        if(node !=null){return;}
//        System.out.println(indent+node.val);
//        System.out.println(node.left+indent+"\t");
//        System.out.println(node.right+indent+"\t");
//    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        //System.out.print(indent + "Left: ");
        display(node.left, indent + "\t");
       // System.out.print(indent + "Right: ");
        display(node.right, indent + "\t");
    }
//    public void populate(Scanner scanner){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter root node: ");
       // int val=sc.nextInt();
        //Node root = new Node(val);
//        populate(sc,root);
//    }
public void populate(Scanner scanner) {
    System.out.println("Enter root node: ");
    int val = scanner.nextInt();
    root = new Node(val); // Set the root member variable.
    populate(scanner, root);
}

    private void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left of "+ node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of"+node.val);
            int val=sc.nextInt();
            node.left=new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of "+ node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of"+node.val);
            int val=sc.nextInt();
            node.right=new Node(val);
            populate(sc,node.right);
        }
    }
}
