import java.util.HashMap;
import java.util.Map;

public class largestSubwith0 {
    public int largestSubarrayWithZeroSum(int[] arr) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> Map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (Map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - Map.get(sum));
            } else {
                Map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        largestSubwith0 ls = new largestSubwith0();
        int[] arr = {1, -1, 2, -2, 3, -3};
        int result = ls.largestSubarrayWithZeroSum(arr);
        System.out.println("Length of the largest subarray with zero sum is: " + result);

        int[] arr2 = {4, 2, -2, 1, 6, -6};
        int result2 = ls.largestSubarrayWithZeroSum(arr2);
        System.out.println("Length of the largest subarray with zero sum is: " + result2);
    }
}
