import java.util.Vector;

public class vecStack {
    Vector<Integer> stack = new Vector<Integer>();

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        vecStack s = new vecStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek()); // 3
        System.out.println(s.pop()); // 3
        System.out.println(s.peek()); // 2
        System.out.println(s.isEmpty()); // false
        s.pop();
        s.pop();
        System.out.println(s.isEmpty()); // true
        
    }
}