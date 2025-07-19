
public class subtree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isIdentical(TreeNode r1, TreeNode r2) {
        if (r1 == null || r2 == null) {
            return r1 == r2;
        }

        return r1.val == r2.val && isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == subRoot;
        }

        if (root.val == subRoot.val && isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        subtree sol = new subtree();
        TreeNode root = sol.new TreeNode(3, 
            sol.new TreeNode(4, sol.new TreeNode(1), sol.new TreeNode(2)), 
            sol.new TreeNode(5));
        TreeNode subRoot = sol.new TreeNode(4, 
            sol.new TreeNode(1), 
            sol.new TreeNode(2));
        
        boolean result = sol.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root: " + result);
    }
}
