public class revWords {
    public static String reverseWords(String str) {
        int n = str.length();
        String s = new StringBuilder(str).reverse().toString();

        String ans = "";

        for (int i = 0; i < n; i++) {
            String word = "";

            while (i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            String newWord = new StringBuilder(word).reverse().toString();
            if (newWord.length() > 0) {
                ans += " " + newWord;
            }
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        System.out.println(reverseWords(str)); 
    }
}