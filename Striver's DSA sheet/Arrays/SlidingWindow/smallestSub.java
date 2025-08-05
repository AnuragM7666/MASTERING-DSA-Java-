public class smallestSub {
    public int smallestSubSum(int[] arr, int target) {
        int st = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= target && st <= end) {
                minLen = Math.min(minLen, end - st + 1);
                sum -= arr[st];
                st++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        smallestSub obj = new smallestSub();
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = obj.smallestSubSum(arr, target);
        if (result > 0) {
            System.out.println("The length of the smallest subarray with sum >= " + target + " is: " + result);
        }
        else {
            System.out.println("No subarray found with sum >= " + target);
        }
    }
}
