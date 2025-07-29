import java.util.ArrayList;
import java.util.List;

public class inorder {
    
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

    void inorderTraversal(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.data);
        inorderTraversal(root.right, result);
    }

    List<Integer> inorderT(Node root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    public static void main(String[] args) {
        inorder tree = new inorder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> inorderResult = tree.inorderT(root);
        System.out.println("Inorder traversal of the tree:");
        for (int value : inorderResult) {
            System.out.print(value + " ");
        }
    }
}
