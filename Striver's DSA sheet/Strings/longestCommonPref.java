public class longestCommonPref {
    public String lcf(String[] s) {
        String pref = s[0];
        for (int i = 1; i < s.length; i++) {
            while (!s[i].startsWith(pref)) {
                pref = pref.substring(0, pref.length() - 1);
            }
            if (pref.isEmpty()) {
                return "";
            }
        }
        return pref;
    }

    public static void main(String[] args) {
        longestCommonPref lcp = new longestCommonPref();
        String[] s = {"flower", "flow", "flight"};
        String result = lcp.lcf(s);
        System.out.println("Longest common prefix: " + result);
    }
}
