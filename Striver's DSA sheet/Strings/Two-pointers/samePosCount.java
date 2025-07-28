/**
 * Problem:
 * Given a string s, reverse it and count how many characters
 * remain at the same position as in the original string.
 */
public class samePosCount {
    public int countChar(String s) {
        int i = 0;
        int n = s.length();
        int count=0;
        while (i < n) {
            int j = n - 1 - i;
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        
        samePosCount spc = new samePosCount();
        String s = "abcba";
        int count = spc.countChar(s);
        System.out.println("Number of characters at the same position from both ends: " + count);
    }
}
