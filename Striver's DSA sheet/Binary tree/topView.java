import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class topView {
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

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static ArrayList<Integer> top(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node currNode = curr.node;
            int hd = curr.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, currNode.data);
            }

            if (currNode.left != null) {
                q.add(new Pair(currNode.left, hd - 1));
            }
            if (currNode.right != null) {
                q.add(new Pair(currNode.right, hd + 1));
            }
        }
        for (int val : map.values()) {
            ans.add(val);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        ArrayList<Integer> topView = top(root);
        System.out.println("Top view of the binary tree: " + topView);
    }
}
