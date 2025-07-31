// Java program to flatten a binary tree to a linked list
public class flattentoLL {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node nextRight = null;

    void flattenToLinkedList(Node root) {
        if (root == null) {
            return;
        }

        flattenToLinkedList(root.right);
        flattenToLinkedList(root.left);

        root.right = nextRight;
        root.left = null;
        nextRight = root;
    }
    public static void main(String[] args) {
        flattentoLL tree = new flattentoLL();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        tree.flattenToLinkedList(root);

        System.out.println("Flattened linked list:");
        Node current = root;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
}