// This code defines a binary tree and a method to print all elements at a given level k.
public class kthlevel {
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

    public void kthEls(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        if (k == 1) {
            System.out.println(root.val);
        }
        kthEls(root.left, k - 1);
        kthEls(root.right, k - 1);
    }

    public static void main(String[] args) {
        
        kthlevel sol = new kthlevel();
        TreeNode root = sol.new TreeNode(1, 
            sol.new TreeNode(2, sol.new TreeNode(4), sol.new TreeNode(5)), 
            sol.new TreeNode(3, sol.new TreeNode(6), sol.new TreeNode(7)));
        
        int k = 2; 
        System.out.println("Elements at level " + k + ":");
        sol.kthEls(root, k);
    }
}
