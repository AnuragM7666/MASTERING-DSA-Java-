//Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:
//Find the leftmost occurrence of the substring part and remove it from s.
//Return s after removing all occurrences of part.
//A substring is a contiguous sequence of characters in a string.
public class removeOccur {
    public static String removesSubString(String str, String part) {
        StringBuilder s = new StringBuilder(str);
        int index = s.indexOf(part);
        while (index != -1) {
            s.delete(index, index + part.length());
            index = s.indexOf(part);
        }
        return s.toString();
    }
    public static void main(String[] args) {
        System.out.println(removesSubString("Hello, World!", "l")); //
    }
}
