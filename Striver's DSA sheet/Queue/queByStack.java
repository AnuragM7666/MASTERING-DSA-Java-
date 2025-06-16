// Implement a first in first out(FIFO)queue using only two stacks.
// The implemented queue should support all the functions of a normal queue(push,peek,pop,and empty).
// Implement the MyQueue class:
// void push(int x)Pushes element x to the back of the queue.int pop()Removes 
// the element from the front of the queue and returns it.int peek()Returns the element 
//  at the front of the queue.boolean empty()Returns true if the queue is empty,false otherwise.
import java.util.Stack;

public class queByStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public queByStack() {
        
    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        queByStack q = new queByStack();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println("Front element: " + q.peek()); 
        System.out.println("Pop element: " + q.pop()); 
        System.out.println("Is queue empty? " + q.empty()); 
        System.out.println("Pop element: " + q.pop()); 
        System.out.println("Pop element: " + q.pop()); 
        System.out.println("Is queue empty? " + q.empty());
    }
}
