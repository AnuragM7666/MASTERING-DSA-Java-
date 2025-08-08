//it is not a DP solution, it is a KMP algorithm solution but we can call it a DP like solution
public class longestPrefSuff {
    public static String longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;

        lps[0] = 0;
        for (int i = 1; i < n; i++) {
            while (len > 0 && s.charAt(i) != s.charAt(len)) {
                len = lps[len - 1];
            }

            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
            } else {
                lps[i] = 0;
            }
        }
        return s.substring(0, lps[n - 1]);
    }
    public static void main(String[] args) {
        String s = "ababab";
        String result = longestPrefixSuffix(s);
        System.out.println("Longest Prefix Suffix: " + result);

        s = "abcabc";
        result = longestPrefixSuffix(s);
        System.out.println("Longest Prefix Suffix: " + result);
    }
}
