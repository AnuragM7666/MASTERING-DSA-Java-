package recursion;
//Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
//k is a positive integer and is less than or equal to the length of the linked list. 
//If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
//You may not alter the values in the list's nodes, only nodes themselves may be changed.
public class revNodes {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        while (count < k) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
            count++;
        }

        ListNode prev = reverseKGroup(temp, k);

        temp = head;
        count = 0;

        while (count < k) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        return prev;
    }
    public static void main(String[] args) {
        revNodes rn = new revNodes();
        ListNode head = rn.new ListNode(1);
        head.next = rn.new ListNode(2);
        head.next.next = rn.new ListNode(3);
        head.next.next.next = rn.new ListNode(4);
        head.next.next.next.next = rn.new ListNode(5);

        int k = 2;

        ListNode reversedHead = rn.reverseKGroup(head, k);
        ListNode current = reversedHead;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
