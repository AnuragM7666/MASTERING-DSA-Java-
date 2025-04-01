//The Aggressive Cows problem is a popular problem in competitive programming, often solved using binary search on the answer.
//You are given n stalls and c cows. The stalls are located at N different positions on a 1D number line. 
//Your task is to place the cows in these stalls such that the minimum distance between any two cows is maximized.
//Input:
//n (number of stalls)
//c (number of cows)
//n integers representing the positions of the stalls.
//Output:
//The largest minimum distance possible between any two cows.

import java.util.Arrays;

public class aggrCow {
    public static boolean isPossible(int[] arr, int n, int c, int minDist) {
        int cows = 1;
        int lastStallPos = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] - lastStallPos >= minDist) {
                cows++;
                lastStallPos = arr[i];
            }

            if (cows == c) {
                return true;
            }
        }
        return false;
    }

    public static int problem(int[] arr, int n, int c) {
        Arrays.sort(arr);
        int start = 1;
        int end = arr[n - 1] - arr[0];
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, c, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9 };
        int n = arr.length;
        int c = 3; 
        int result = problem(arr, n, c);
        System.out.println("Maximum minimum distance is: " + result);
    }
}
