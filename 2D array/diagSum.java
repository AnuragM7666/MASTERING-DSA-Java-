public class diagSum {
    public static int DiagonalSum(int[][] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) { //optimized loop
            sum += arr[i][i]; // Primary diagonal

            if(i!= n - 1 - i) { // Avoid double counting the middle element in odd-sized matrices
                sum += arr[i][n - 1 - i]; // Secondary diagonal
            }
            // for (int j = 0; j < n; j++) {
            //     if (i == j) {
            //         sum += arr[i][j];

            //     } else if (j == n - 1 - i) {
            //         sum += arr[i][j];
            //     }
            // }
        }
        return sum;
        //2d vectors
        // Vector2d v1 = new Vector2d(3.0, 4.0,5);
        //Vector2d v2 = new Vector2d(1.0, 2.0);
        //v1.add(v2);

    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        
        System.out.println("Diagonal sum is: " + DiagonalSum(arr, n));
    }
}
