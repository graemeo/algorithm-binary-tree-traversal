public class Node 
{
    private Node left;
    private Node right;
    private int data;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node getLeftChild() {
        return left;
    }

    public Node getRightChild() {
        return right;
    }

    public int getData() {
        return data;
    }
}
