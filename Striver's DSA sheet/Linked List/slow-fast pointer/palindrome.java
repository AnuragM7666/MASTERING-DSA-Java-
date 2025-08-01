import java.util.Stack;

public class palindrome {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode curr = head;
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            if (curr.val != st.pop()) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome solution = new palindrome();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(1);

        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? : " + result);
    }
}
