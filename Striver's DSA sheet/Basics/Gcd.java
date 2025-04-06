public class Gcd {
    public static int gcd(int a, int b) {        
        if (a == b)
            return a;
            
        while (a>0 && b>0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a == 0 ? b : a;
    }public static void main(String[] args) {
        int a = 56, b = 28;
        int GCD = gcd(a, b);
        int lcm = (a * b) / GCD;
        
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
