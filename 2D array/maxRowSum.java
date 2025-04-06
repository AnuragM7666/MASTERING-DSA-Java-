public class maxRowSum {
    public static int MaxSum(int[][] arr,int rows, int cols) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rows = arr.length;
        int cols = arr[0].length;
        
        System.out.println("Maximum row sum is: " + MaxSum(arr, rows, cols));
    }
}