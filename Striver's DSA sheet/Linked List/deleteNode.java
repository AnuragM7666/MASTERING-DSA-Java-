public class deleteNode {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    public void deleteNo(ListNode del_node) {
        // This function assumes that the node to be deleted is not the last node
        //head is not given, only the node to be deleted is given
        del_node.val = del_node.next.val;
        del_node.next = del_node.next.next;
    }
    public static void main(String[] args) {
        deleteNode solution = new deleteNode();
        ListNode head = solution.new ListNode(4);
        head.next = solution.new ListNode(5);
        head.next.next = solution.new ListNode(1);
        head.next.next.next = solution.new ListNode(9);

        ListNode nodeToDelete = head.next;
        System.out.println("Before deletion:");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        solution.deleteNo(nodeToDelete);
        System.out.println("\nAfter deletion:");
        curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
