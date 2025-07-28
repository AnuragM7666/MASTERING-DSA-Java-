public class GCDofArr {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int findGCD(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, arr[i]);
            if (ans == 1)
                return 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        GCDofArr obj = new GCDofArr();
        int[] arr = {12, 15, 21, 30};
        int result = obj.findGCD(arr);
        
        System.out.println("GCD of the array is: " + result);
    }
}
