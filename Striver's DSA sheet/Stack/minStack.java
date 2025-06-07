//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.
import java.util.Stack;

public class minStack {
    Stack<Long> s=new Stack<>();
    long minVal;
    public void MinStack() {
        
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push((long)val);
            minVal=val;
        }else{
            if(val<minVal){
                s.push(2L*val-minVal);
                minVal=val;
            }else{
                s.push((long)val);
            }
        }
    }
    
    public void pop() {
        if(s.peek()<minVal){
            minVal=2*minVal-s.peek();
        }
        s.pop();
    }
    
    public int top() {
        long top=s.peek();
        if(top<minVal){
            return (int) minVal;
        }
        return (int) top;
    }
    
    public int getMin() {
        return (int) minVal;
    }
    public static void main(String[] args) {
        minStack ms = new minStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        System.out.println("Top element: " + ms.top()); // Should print 7
        System.out.println("Minimum element: " + ms.getMin()); // Should print 3
        ms.pop();
        System.out.println("Top element after pop: " + ms.top()); // Should print 3
        System.out.println("Minimum element after pop: " + ms.getMin()); // Should still print 3
    }
}

//Another solution

// import java.util.Stack;

// class Pair<U, V> {
//     public U first;
//     public V second;

//     public Pair(U first, V second) {
//         this.first = first;
//         this.second = second;
//     }
// }

// class MinStack {
//     Stack<Pair<Integer, Integer>> s = new Stack<>();

//     public MinStack() {
//     }

//     public void push(int val) {
//         if (s.isEmpty()) {
//             s.push(new Pair<>(val, val));
//         } else {
//             int minVal = Math.min(val, s.peek().second);
//             s.push(new Pair<>(val, minVal));
//         }
//     }

//     public void pop() {
//         s.pop();
//     }

//     public int top() {
//         return s.peek().first;
//     }

//     public int getMin() {
//         return s.peek().second;
//     }
// }
