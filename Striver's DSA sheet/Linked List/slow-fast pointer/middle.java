//Given the head of a singly linked list, return the middle node of the linked list.

//If there are two middle nodes, return the second middle node.
public class middle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode middleofLL(ListNode head) {
        // Brute force approach
        // int count = 0;
        // ListNode temp = head;
        // while (temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // int midIndex = count / 2;
        // temp = head;
        // for (int i = 0; i < midIndex; i++) {
        //     temp = temp.next;
        // }

        // return temp;

        //slow and fast pointer approach

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        middle m = new middle();
        ListNode middleNode = m.middleofLL(head);
        System.out.println("The middle node value is: " + middleNode.val);
    }
}
