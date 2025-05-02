public class ll{
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class List {
        Node head;
        Node tail;

        public List() {
            head = null;
            tail = null;
        }

        void push_front(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        void push_back(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
                return;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void pop_front() {
            if (head == null)
                return;

            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        
        void pop_back() {
            if (head == null)
                return;

            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;

        }

        void insert(int val, int pos) {
            if (pos < 0) {
                System.out.println("Position out of bounds");
                return;
            }
            if (pos == 0) {
                push_front(val);
                return;
            }
            Node current = head;
            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;
        }

        void search(int val) {
            Node current = head;
            int idx = 0;
            while (current != null) {
                if (current.data == val) {
                    System.out.println("Found " + val + " at index " + idx);
                    return;
                }
                current = current.next;
                idx++;
            }
            System.out.println("Not Found " + val);
        } 

        void printLL() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ll list = new ll();
        List myList = list.new List();
        myList.push_front(10);
        myList.push_front(20);
        myList.push_back(40);
        myList.push_back(50);
        myList.push_front(30);
        myList.pop_front();
        myList.pop_back();

        myList.insert(25, 2);
        myList.printLL();

        myList.search(25);
    }
}