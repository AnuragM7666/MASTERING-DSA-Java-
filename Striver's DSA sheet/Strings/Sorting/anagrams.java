package Sorting;
import java.util.Arrays;
//two strings are anagrams if they contain the same characters in the same frequency
public class anagrams {
    public static boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
