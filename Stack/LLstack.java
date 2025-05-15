import java.util.LinkedList;
public class LLstack {
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int value) {
        stack.addFirst(value); // push to front
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeFirst(); // pop from front
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst(); // peek front
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LLstack s = new LLstack();
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
