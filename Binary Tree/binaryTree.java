import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class binaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;    
        }
    }
    static int index=-1;

    Node buildTree(int[] preorder) {
        index++;
        if (preorder[index] == -1) {
            return null;
        }
        Node root = new Node(preorder[index]);
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);
        return root;
    }

    void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); 
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current == null) {
                if (queue.isEmpty()) {
                    break;
                }
                queue.add(null);
                System.out.println(); // New line for each level
                continue;
            }
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        int[] preorder = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
        Node root = tree.buildTree(preorder);
        System.out.println("Binary tree constructed from preorder traversal.");
        System.out.println("Root node value: " + root.data);
        System.out.println("Root node value: " + root.left.data);
        System.out.println("Root node value: " + root.right.data);
        System.out.print("Preorder traversal of the binary tree: ");
        tree.preorderTraversal(root);
        System.out.println();
        
        System.out.print("Inorder traversal of the binary tree: ");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder traversal of the binary tree: ");
        tree.postOrderTraversal(root);
        System.out.println();

        System.out.print("Level order traversal of the binary tree: ");
        tree.levelOrderTraversal(root);
        System.out.println();
    }
}