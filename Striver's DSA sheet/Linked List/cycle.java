//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
//Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). 
//It is -1 if there is no cycle. Note that pos is not passed as a parameter.
//Do not modify the linked list.
public class cycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode prev = slow;
        while (prev.next != slow) {
            prev = prev.next;
        }
        prev.next = null; 

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head; 
        cycle c = new cycle();
        ListNode cycleStart = c.removeCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle detected starting at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
