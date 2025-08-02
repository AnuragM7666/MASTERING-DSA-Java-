import java.util.Stack;
//this code finds the smallest element in a stack(special stack problem)
public class smallest {
    public int smallestEl(Stack<Integer> s) {
        int min = Integer.MAX_VALUE;

        while (!s.isEmpty()) {
            min = Math.min(min, s.pop());
        }
        return min;
    }
    public static void main(String[] args) {
        smallest sm = new smallest();
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);

        int minElement = sm.smallestEl(s);
        System.out.println("Smallest Element: " + minElement);
    }
}
