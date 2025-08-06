import java.util.HashMap;
//this code checks if the string s1 can be constructed from string s2
public class ransomNote {
    public boolean doContain(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : c2) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : c1) {
            if (!map.containsKey(c) || map.get(c)==0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
    ransomNote rn = new ransomNote();
        String s1 = "aabbc";
        String s2 = "abcabc";
        boolean result = rn.doContain(s1, s2);
        System.out.println("Can s1 be constructed from s2? " + result);

        System.out.println(rn.doContain("aa", "ab")); 
        System.out.println(rn.doContain("hello", "hheessllooo"));
    }
}
