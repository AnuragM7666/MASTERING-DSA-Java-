//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
// This matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
public class search2 {
    public boolean searchRow(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (target == arr[row][col]) {
                return true;
            } else if (target < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        search2 s = new search2();
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
        int target = 3;
        System.out.println(s.searchRow(arr, target));
    }
}
