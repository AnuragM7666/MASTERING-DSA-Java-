package Hashing;
import java.util.HashMap;

public class nonRepeatingChar {
    public static char non(String s) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = non(s);
        if (result != '$') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
