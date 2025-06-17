//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstUnchar {
    // public static int firstUniqChar(String s) {
    //     int[] freq = new int[26];
    //     for (char c : s.toCharArray()) {
    //         freq[c - 'a']++;
    //     }
    //     for (int i = 0; i < s.length(); i++) {
    //         if (freq[s.charAt(i) - 'a'] == 1) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //using hashmap and queue

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            q.offer(c); //q.add(c);
        }

        while (!q.isEmpty()) {
            char current = q.poll(); //q.remove();
            if (charCount.get(current) == 1) {
                return s.indexOf(current);
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        String s = "eetcode";
        int index = firstUniqChar(s);
        if (index != -1) {
            System.out.println("The first unique character is at index: " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
