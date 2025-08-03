import java.util.HashSet;import java.util.Set;
public class longestSubwithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (st.contains(s.charAt(right))) {
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        longestSubwithoutRepeat solution = new longestSubwithoutRepeat();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
