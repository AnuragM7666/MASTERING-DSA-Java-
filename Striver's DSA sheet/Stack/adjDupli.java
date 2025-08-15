import java.util.Stack;
//this is the code for removing adjacent duplicates from a string
public class adjDupli {
    public String removeAdjacentDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st) {
            ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        adjDupli obj = new adjDupli();
        String s = "abbaca";
        System.out.println(obj.removeAdjacentDuplicates(s));
    }
}
