//Implement a last-in-first-out (LIFO) stack using only two queues. 
//The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
// Implement the MyStack class:
// void push(int x)Pushes element x to the top of the stack.int pop()Removes the element on the top 
// of the stack and returns it.int top()Returns the element on the top of the 
// stack.boolean empty()Returns true if the stack is empty,false otherwise.
import java.util.LinkedList;
import java.util.Queue;

public class stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public stack() {
        
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top element: " + s.top()); 
        System.out.println("Pop element: " + s.pop()); 
        System.out.println("Is stack empty? " + s.empty()); 
        System.out.println("Pop element: " + s.pop()); 
        System.out.println("Pop element: " + s.pop()); 
        System.out.println("Is stack empty? " + s.empty()); 
    }
}
