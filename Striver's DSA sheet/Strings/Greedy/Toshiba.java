//this code calculates the number of steps required to make all characters in a string the same
public class Toshiba {
    public int magicNumber(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = 0;

        for (int val : freq) {
            maxFreq = Math.max(val, maxFreq);
        }

        return s.length() - maxFreq;
    }

    public static void main(String[] args) {
        
        Toshiba toshiba = new Toshiba();
        System.out.println(toshiba.magicNumber("abacaba")); 
        System.out.println(toshiba.magicNumber("aabbcc"));
        System.out.println(toshiba.magicNumber("abcde")); 
    }
}
