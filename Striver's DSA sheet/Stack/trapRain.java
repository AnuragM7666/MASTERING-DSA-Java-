//Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.
public class trapRain {
    public int trap(int[] ht) {
        int n = ht.length;
        //two pointer approach
        int ans = 0;
        int l = 0, r = n - 1;
        int lmax = 0, rmax = 0;

        while (l < r) {
            lmax = Math.max(lmax, ht[l]);
            rmax = Math.max(rmax, ht[r]);

            if (lmax < rmax) {
                ans += lmax - ht[l];
                l++;
            } else {
                ans += rmax - ht[r];
                r--;
            }
        }
        return ans;
        // int[] lb = new int[n];
        // int[] rb = new int[n];

        // lb[0] = ht[0];
        // rb[n - 1] = ht[n - 1];

        // for (int i = 1; i < n; i++) {
        //     lb[i] = Math.max(lb[i - 1], ht[i]);
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     rb[i] = Math.max(rb[i + 1], ht[i]);
        // }

        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     ans += Math.min(lb[i], rb[i]) - ht[i];
        // }
        // return ans;
    }
    public static void main(String[] args) {
        trapRain trap = new trapRain();
        int[] heights = {4,2,0,3,2,5};
        int result = trap.trap(heights);
        System.out.println("Trapped rainwater: " + result);
    }
}
