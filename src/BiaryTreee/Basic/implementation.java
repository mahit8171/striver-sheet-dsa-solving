package BiaryTreee.Basic;

public class implementation {


    static class Node{
        int value ;
        Node left ;
        Node right ;
        public Node(int value){
            this.value = value ;
        }
    }
    public static  void display(Node root){
        if (root == null)return;

        System.out.print(root.value + " ->");
        if(root.left != null)System.out.print(root.left.value + "  ");
        if(root.right!=null)System.out.print(root.right.value );
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(9);
        Node f = new Node(7);
        a.left = b ;
        a.right = c;
        b.right = d ;
        b.left = e ;
        c.left = f ;

        display(a);

    }
}
