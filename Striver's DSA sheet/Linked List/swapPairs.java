public class swapPairs {
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
    
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode first = head;
        ListNode sec = head.next;

        while (first != null && sec != null) {
            ListNode third = sec.next;
            sec.next = first;
            first.next = third;

            if (prev != null) {
                prev.next = sec;
            } else {
                head = sec;
            }

            prev = first;
            first = third;

            if (third != null) {
                sec = third.next;
            } else {
                sec = null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        
        swapPairs sp = new swapPairs();
        ListNode head = sp.new ListNode(1);
        head.next = sp.new ListNode(2);
        head.next.next = sp.new ListNode(3);
        head.next.next.next = sp.new ListNode(4);

        ListNode swappedHead = sp.swapPairs(head);
        ListNode current = swappedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}