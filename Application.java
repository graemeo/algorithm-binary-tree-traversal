public class Application
{

    /*
                    0
               /         \
            1               2
        /       \       /       \
       3         4     5         6

       in order = 3 1 4 0 5 2 6
       pre order = 0 1 3 4 2 5 6 
       post order = 3 4 1 5 6 2 0

    */

    public static void main(String[] args) {
        Node root = getTreeNodesInLinkedList();
        inOrderTraversalWithLinkedList(root);
        System.out.println();

        preOrderTraversalWithLinkedList(root);
        System.out.println();

        postOrderTraversalWithLinkedList(root);
        System.out.println();
    }

    public static void inOrderTraversalWithLinkedList(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversalWithLinkedList(node.getLeftChild());
        System.out.print(node.getData() + " ");
        inOrderTraversalWithLinkedList(node.getRightChild());
    } 

    public static void preOrderTraversalWithLinkedList(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        preOrderTraversalWithLinkedList(node.getLeftChild());
        preOrderTraversalWithLinkedList(node.getRightChild());
    } 

    public static void postOrderTraversalWithLinkedList(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversalWithLinkedList(node.getLeftChild());
        postOrderTraversalWithLinkedList(node.getRightChild());
        System.out.print(node.getData() + " ");
    }

    public static Node getTreeNodesInLinkedList() {
        Node left = new Node(1, new Node(3, null, null), new Node(4, null, null));
        Node right = new Node(2, new Node(5, null, null), new Node(6, null, null));
        Node root = new Node(0, left, right);
        
        return root;
    }

}
