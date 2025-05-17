import java.util.Stack;
import java.util.Vector;

public class StockSpan {
    public Vector<Integer> calcSpan(int[] price) {
        Vector<Integer> ans = new Vector<>(price.length);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < price.length; i++) {
            while (st.size() > 0 && price[st.peek()] <= price[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(i, i + 1);
            } else {
                ans.add(i, i - st.peek());
            }

            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        StockSpan ss = new StockSpan();
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        Vector<Integer> span = ss.calcSpan(price);
        System.out.println("Stock Span: " + span);

        
    }
}
