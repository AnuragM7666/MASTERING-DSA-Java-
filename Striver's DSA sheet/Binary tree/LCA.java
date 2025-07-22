//lowest common ancestor in a binary tree
//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
//in the tree. The lowest common ancestor is defined between two nodes p and q as the lowest node
//that has both p and q as descendants (where we allow a node to be a descendant of itself).
//A node is a descendant of itself. 

public class LCA {
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

    public Node lowest(Node root, Node p, Node q) {
        if (root == null)
            return null;

        if (root.data == p.data || root.data == q.data) {
            return root;
        }
        Node lt = lowest(root.left, p, q);
        Node rt = lowest(root.right, p, q);

        if (lt != null && rt != null) {
            return root;
        } else if (lt != null) {
            return lt;
        } else {
            return rt;
        }
    }

    public static void main(String[] args) {
        
        LCA tree = new LCA();
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Node p = root.left; // 5
        Node q = root.left.right.right; // 4

        Node lcaNode = tree.lowest(root, p, q);
        if (lcaNode != null) {
            System.out.println("LCA of " + p.data + " and " + q.data + " is: " + lcaNode.data);
        } else {
            System.out.println("LCA not found");
        }
    }
}
