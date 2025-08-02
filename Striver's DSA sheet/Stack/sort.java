import java.util.Stack;
//this code sorts a stack in ascending order using another stack
public class sort {
    public Stack<Integer> sortReverse(Stack<Integer> s) {
        Stack<Integer> ans = new Stack<>();

        while (!s.isEmpty()) {
            int temp = s.pop();

            while (!ans.isEmpty() && ans.peek() > temp) {
                s.push(ans.pop());
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        sort sorter = new sort();
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);
        Stack<Integer> sortedStack = sorter.sortReverse(s);
        System.out.println("Sorted Stack: " + sortedStack);

    }
}
