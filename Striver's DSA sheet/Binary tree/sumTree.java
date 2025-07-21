//Given a Binary Tree. Check for the Sum Tree for every node except the leaf node.
// Return true if it is a Sum Tree otherwise, return false.
//A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes
// present in its left subtree and right subtree. An empty tree is also a Sum Tree 
//as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.
public class sumTree {
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
    boolean isLeaf(Node root) {
        if(root==null) return false;

        return root.left==null && root.right==null;
    }

    int sum(Node root) {
        if (root == null)
            return 0;

        return root.data + sum(root.left) + sum(root.right);
    }

    boolean isSumTree(Node root) {
        if (isLeaf(root) || root == null)
            return true;

        if (isSumTree(root.left) && isSumTree(root.right)) {
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            return root.data == leftSum + rightSum;
        }
        return false;
    }

    public static void main(String[] args) {
        sumTree tree = new sumTree();
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(3);

        if (tree.isSumTree(root)) {
            System.out.println("The tree is a Sum Tree");
        } else {
            System.out.println("The tree is not a Sum Tree");
        }
    }
}
