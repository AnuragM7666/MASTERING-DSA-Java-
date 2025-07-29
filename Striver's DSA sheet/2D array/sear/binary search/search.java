//You are given an m x n integer matrix matrix with the following two properties:
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//You must write a solution in O(log(m * n)) time complexity.
public class search {
    boolean searchRow(int[][] arr, int target, int row) {
        int start = 0;
        int end = arr[row].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[row][mid] == target) {
                return true;
            } else if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
        
    
    public boolean searchTarget(int[][] arr, int target) {
        int sr = 0;
        int m = arr.length;
        int er = m - 1;

        while (sr <= er) {
            int midr = sr + (er - sr) / 2;
            int n = arr[midr].length;
            if (target >= arr[midr][0] && target <= arr[midr][n - 1]) {
                return searchRow(arr, target, midr);
            } else if (target > arr[midr][n - 1]) {
                sr = midr + 1;
            } else {
                er = midr - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        search s = new search();
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
        int target = 3;
        System.out.println(s.searchTarget(arr, target));
    }
    
}
