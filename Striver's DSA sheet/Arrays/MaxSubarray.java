public class MaxSubarray { //Brute-force approach : - Maxinum subarray sum
    public static int SubArr(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length - 1;

        for (int start = 0; start < n; start++) {
            int CurrentSum = 0;
            for (int end = start; end < n; end++) {
                CurrentSum += arr[end];
                maxSum = Math.max(maxSum, CurrentSum);
            }

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {9, 2, -3, 4, 5, -3, 7, 2};
        System.out.println(SubArr(arr));
    }
}
