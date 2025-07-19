//The diameter of a binary tree is defined as the length of the longest path between any two nodes in a tree. 
//This path may or may not pass through the root.
public class diameter {
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

    int ans = 0;

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(lh + rh, ans);

        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBT(TreeNode root) {
        height(root);

        return ans;
    }

    public static void main(String[] args) {
        diameter sol = new diameter();
        TreeNode root = sol.new TreeNode(1, 
            sol.new TreeNode(2, sol.new TreeNode(4), sol.new TreeNode(5)), 
            sol.new TreeNode(3));
        
        int result = sol.diameterOfBT(root);
        System.out.println("Diameter of the binary tree: " + result);
    }
}
