import java.math.BigInteger;
import java.util.ArrayList;

public class factOfLargeNums {
    private BigInteger fact(int n) {
        if (n == 0 || n == 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
    public ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        BigInteger factorial = fact(n);
        String s = factorial.toString();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            ans.add(digit);
        }
        return ans;
    }

    public static void main(String[] args) {
        factOfLargeNums fln = new factOfLargeNums();
        int n = 4; 

        ArrayList<Integer> result = fln.factorial(n);

        System.out.println("Digits of factorial of " + n + " are: " + result);
    }
}
