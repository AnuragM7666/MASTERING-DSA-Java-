// You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer.
// This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
// These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
// Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list.
// Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
// Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
public class flattenDLL {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        Node(int val) {
            this.val = val;
        }

    }
    
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                while (curr.next != null) {
                    curr = curr.next;
                }
                if (next != null) {
                    curr.next = next;
                    next.prev = curr;
                }
            }
            curr = curr.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        flattenDLL f = new flattenDLL();
        Node head = f.new Node(1);
        head.next = f.new Node(2);
        head.next.prev = head;
        head.next.child = f.new Node(3);
        head.next.child.next = f.new Node(4);
        head.next.child.next.prev = head.next.child;
        head.next.child.next.child = f.new Node(5);
        head.next.child.next.child.next = f.new Node(6);
        
        System.out.println("Original List:");
        printList(head);

        Node flattenedHead = f.flatten(head);
        
        System.out.println("Flattened List:");
        printList(flattenedHead);
    }
}
