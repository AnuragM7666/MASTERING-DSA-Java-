
public class identical {
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
    public static void main(String[] args) {
        identical sol = new identical();
        TreeNode root1 = sol.new TreeNode(1, sol.new TreeNode(2), sol.new TreeNode(3));
        TreeNode root2 = sol.new TreeNode(1, sol.new TreeNode(2), sol.new TreeNode(3));
        boolean result = sol.isIdentical(root1, root2);
        System.out.println("Trees are identical: " + result);
    }
}
