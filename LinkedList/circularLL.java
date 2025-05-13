public class circularLL {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class circularList {
        Node head;
        Node tail;

        public circularList() {
            head = null;
            tail = null;
        }

        void insertAtHead(int val) {
            Node newNode = new Node(val);

            if (tail == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }
        }

        void insertAtTail(int val) {
            Node newNode = new Node(val);

            if (tail == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                tail.next = newNode;
                tail = newNode;
            }
        }

        void deleteHead() {
            if (head == null)
                return;
            else if (head == tail) {
                head = tail = null;
            } else {
                Node temp = head;
                head = head.next;
                tail.next = head;

                temp.next = null;
            }

        }

        void deleteTail() {
            if (head == null)
                return;
            else if (head == tail) {
                head = tail = null;
            } else {
                Node temp = tail;
                Node prev = head;
                while (prev.next != tail) {
                    prev = prev.next;
                }
                tail = prev;
                tail.next = head;

                temp.next = null;
            }
        }

        void printLL() {
            if (head == null)
                return;
            System.out.print(head.data + "=>");
            Node temp = head.next;
            while (temp != head) {
                System.out.print(temp.data + "<=>");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    
    public static void main(String[] args) {
        circularLL.circularList cll = new circularLL().new circularList();

        // Inserting elements at head
        cll.insertAtHead(30);
        cll.insertAtHead(20);
        cll.insertAtHead(10);
        cll.printLL(); // Expected: 10=>20<=>30<=>10

        // Inserting elements at tail
        cll.insertAtTail(40);
        cll.insertAtTail(50);
        cll.printLL(); // Expected: 10=>20<=>30<=>40<=>50<=>10

        // Deleting head
        cll.deleteHead();
        cll.printLL(); // Expected: 20=>30<=>40<=>50<=>20

        // Deleting tail
        cll.deleteTail();
        cll.printLL(); // Expected: 20=>30<=>40<=>20
    }

}
