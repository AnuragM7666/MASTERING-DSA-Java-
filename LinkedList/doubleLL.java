public class doubleLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = prev = null;
        }
    }

    class DoubleList {
        Node head;
        Node tail;

        public DoubleList() {
            head = tail = null;
        }

        void push_front(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
        
        void push_back(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }

        void pop_front() {
            if (head == null)
                return;
            Node temp = head;
            head = head.next;

            if (head != null) {
                head.prev = null;
            }
            temp.next = null;
        }
        
        void pop_back() {
            if (head == null)
                return;
            Node temp = tail;
            tail = tail.prev;

            if (head != null) {
                tail.next = null;
            }
            temp.prev = null;
        }

        void printLL() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "<=>");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        doubleLL outer = new doubleLL();
        DoubleList list = outer.new DoubleList();

        list.push_back(10);
        list.push_back(20);
        list.push_front(5);
        list.push_front(2);
        System.out.println("After inserting 2, 5 at front and 10, 20 at back:");
        list.printLL(); 

        list.pop_front();
        System.out.println("After pop_front:");
        list.printLL(); 

        list.pop_back();
        System.out.println("After pop_back:");
        list.printLL(); 
    }
}
