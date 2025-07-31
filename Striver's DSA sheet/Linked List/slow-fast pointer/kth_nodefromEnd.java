//this code finds the kth node from end
public class kth_nodefromEnd {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int kthNodeFromEnd(Node head, int k) {
        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        kth_nodefromEnd solution = new kth_nodefromEnd();
        Node head = solution.new Node(1);
        head.next = solution.new Node(2);
        head.next.next = solution.new Node(3);
        head.next.next.next = solution.new Node(4);
        head.next.next.next.next = solution.new Node(5);

        int k = 2;
        int result = solution.kthNodeFromEnd(head, k);
        if (result != -1) {
            System.out.println("The " + k + "th node from the end is: " + result);
        } else {
            System.out.println("The list is shorter than " + k + " nodes.");
        }

    }
}
