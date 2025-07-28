//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class exponent {
    public static double myPow(double x, int n) {
        double ans = 1;
        if (n == 0)
            return 1;
        if (x == 1)
            return 1;
        if (x == 0)
            return 0;

        if (x == -1) {
            return (n % 2 == 0) ? 1 : -1;
        }

        long expo = n;
        if (expo < 0) {
            x = 1 / x;
            expo = -expo;
        }

        while (expo > 0) {
            if (expo % 2 == 1) {
                ans *= x;
            }
            x *= x;
            expo /= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, 10)); // 1024.0
    }
}
