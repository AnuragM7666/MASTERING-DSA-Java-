public class queue {
    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class using Linked List
    static class Queue {
        private Node front, rear;

        public Queue() {
            this.front = this.rear = null;
        }

        // Enqueue - Add element to the rear
        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // Dequeue - Remove element from the front
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = front.data;
            front = front.next;

            // If front becomes null, set rear also to null
            if (front == null)
                rear = null;

            return val;
        }

        // Peek - Get the front element without removing
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return front == null;
        }

        // Display all elements in queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // Output: 10 -> 20 -> 30 -> NULL

        System.out.println("Dequeued: " + q.dequeue()); // Output: 10
        System.out.println("Front element: " + q.peek()); // Output: 20

        q.display(); // Output: 20 -> 30 -> NULL
    }
}
