//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//removing all non-alphanumeric characters, it reads the same forward and backward. 
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
public class isValidPalindrome {
    public static boolean isAlphaNumeric(char c) {
        if(Character.isLetter(c) || Character.isDigit(c)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isAlphaNumeric(s.charAt(start))) {
                start++;
                continue;
            }

            if (!isAlphaNumeric(s.charAt(end))) {
                end--;
                continue;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 
    }
}
