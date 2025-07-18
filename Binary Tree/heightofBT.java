public class heightofBT {
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    static int index = -1;
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

    int height(Node root) {
        if (root == null)
            return 0;

        int leftHt = height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt, rightHt) + 1;
    }

    int count(Node root) {
        if (root == null) {
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        return left + right + 1;
    }

    int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        heightofBT tree = new heightofBT();
        int[] preorder = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
        Node root = tree.buildTree(preorder);

        int h = tree.height(root);
        System.out.println("Height of the binary tree: " + h);

        int count = tree.count(root);
        System.out.println("Number of nodes in the binary tree: " + count);

        int sum = tree.sum(root);
        System.out.println("Sum of all nodes in the binary tree: " + sum);
    }
}
