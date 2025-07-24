import java.util.ArrayList;
import java.util.List;

public class treePaths {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    void allPaths(Node root, String path, List<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        if (root.left != null) {
            allPaths(root.left, path + "->" + root.left.data, ans);
        }
        if (root.right != null) {
            allPaths(root.right, path + "->" + root.right.data, ans);
        }
    }

    List<String> alltreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        String path = Integer.toString(root.data);

        allPaths(root, path, ans);
        return ans;
    }

    public static void main(String[] args) {
        
        treePaths tree = new treePaths();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<String> paths = tree.alltreePaths(root);
        System.out.println("All paths from root to leaf nodes:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
