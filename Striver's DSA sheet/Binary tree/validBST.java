// This code checks if a binary tree is a valid Binary Search Tree (BST).
// a tree is a valid BST if for every node, all values in the left subtree are less than the node's value,
// and all values in the right subtree are greater than the node's value.
public class validBST {
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

    public boolean isBST(Node curr, int min, int max) {
        if (curr == null)
            return true;

        if (curr.data <= min || curr.data >= max) {
            return false;
        }

        boolean isLBST = isBST(curr.left, min, curr.data);
        boolean isRBST = isBST(curr.right, curr.data, max);

        return isLBST && isRBST;
    }
    
    boolean isValidBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        
        validBST tree = new validBST();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.right = new Node(20);
        root.right.left = new Node(12);

        if (tree.isValidBST(root)) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is not a valid BST.");
        }
    }
}
