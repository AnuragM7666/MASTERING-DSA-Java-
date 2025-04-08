//Given an m x n matrix, return all elements of the matrix in spiral order.
public class spiral {
    public static int spiralMat(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse the top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;

            // Traverse the right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            // Traverse the bottom row
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(arr[endRow][i] + " ");
                }
                endRow--;
            }

            // Traverse the left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }
        }
        return 0; // Return 0 to indicate successful completion
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        spiralMat(arr);
        System.out.print(spiralMat(arr));
    }
    
}
