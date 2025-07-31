//this code is for removing duplicates from a linked list in unsorted LL
import java.util.HashSet;

public class removeDupli {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeDuplicates(ListNode head) {

        //if array is sorted then
        
        // ListNode curr = head;
        // while (curr != null && curr.next != null) {
        //     if (curr.val == curr.next.val) {
        //         curr.next = curr.next.next;
        //     }
        //     else {
        //         curr = curr.next;
        //     }
        // }
        HashSet<Integer> seen = new HashSet<>();
        ListNode curr = head;
        seen.add(curr.val);

        while (curr.next != null) {
            if (seen.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                seen.add(curr.next.val);
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);

        removeDupli solution = new removeDupli();
        ListNode result = solution.removeDuplicates(head);
        System.out.print("List after removing duplicates: ");
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
