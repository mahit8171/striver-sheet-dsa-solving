    package BiaryTreee.Basic;

    class traversingTree {

        static class Node {

            int value ;
            Node right ;
            Node left ;

            Node( int value){
                this.value = value ;
            }

        }

        public static int size(Node root){
            if(root == null) return 0;

            return size(root.left) + size(root.right) +1 ;


        }
        public static int sum(Node rood){
            if (rood == null) return 0;
            return rood.value + sum( rood.left)  + sum(rood.right);
        }

        public static int max(Node root){
            if(root == null) return Integer.MIN_VALUE ;

            return Integer.max(root.value , Integer.max(max(root.left ),max( root.right)));
        }

        public static int hieght(Node root ){
            if(root == null || (root.left == null && root.right == null)) return 0 ;

            return 1 + Math.max(hieght(root.left), hieght(root.right));
        }
        public static void nthLevel (Node root , int n){
            if(root == null) return;
            if(n==1) System.out.print(root.value + " ");
            nthLevel(root.right , n-1);
            nthLevel(root.left , n-1);
        }


        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g = new Node(7);
            Node h = new Node(8);
            Node i = new Node(9);
            a.left = b ;
            a.right = c;
            b.left = d ;
            b.right = e;
            c.left = f ;
            c.right = g ;
            d.left = h ;
            d.right = i ;

            int size = size(a);

            System.out.println(size);

            int sum = sum(a );
            System.out.println(sum);

            int max = max(a);
            System.out.println(max);

            int hieght = hieght(a);
            System.out.println(hieght);

            nthLevel(a , 1);



        }




        }
