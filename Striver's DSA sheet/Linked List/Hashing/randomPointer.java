package Hashing;
// A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
// Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
// For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
// Return the head of the copied linked list.
// The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
// val: an integer representing Node.val
// random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
// Your code will only be given the head of the original linked list.
import java.util.HashMap;
public class randomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyLL(Node head) {
        if (head == null)
            return null;
        
        HashMap<Node, Node> mymap = new HashMap<>();

        Node oldTemp = head;

        while (oldTemp != null) {
            mymap.put(oldTemp, new Node(oldTemp.val));
            oldTemp = oldTemp.next;
        }

        oldTemp=head;
        while (oldTemp != null) {
            Node newNode = mymap.get(oldTemp);
            newNode.next = mymap.get(oldTemp.next);
            newNode.random = mymap.get(oldTemp.random);
            oldTemp = oldTemp.next;
        }
        return mymap.get(head);
    }
    public static void main(String[] args) {

        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        head.random = null;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;
        
        randomPointer solution = new randomPointer();
        
        Node copiedHead = solution.copyLL(head);
        
        System.out.println("Original List:");
        printList(head);
        
        System.out.println("\nCopied List:");
        printList(copiedHead);
        
        System.out.println("\nVerification:");
        System.out.println("Original head != Copied head: " + (head != copiedHead));
        System.out.println("Original head.val == Copied head.val: " + (head.val == copiedHead.val));
    }
    
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print("[" + temp.val + ", ");
            if (temp.random != null) {
                Node finder = head;
                int index = 0;
                while (finder != temp.random) {
                    finder = finder.next;
                    index++;
                }
                System.out.print(index);
            } else {
                System.out.print("null");
            }
            System.out.print("]");
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
