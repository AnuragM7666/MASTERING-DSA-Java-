//The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
//Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
//Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and
// an empty space, respectively.
import java.util.*;
public class nqueen {
    public boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public void nQueen(char[][] board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                curr.add(new String(board[i]));
            }
            ans.add(curr);
            return;
        }
        
        for (int j = 0; j < n; j++) {
            if(isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1, n, ans);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        nQueen(board, 0, n, ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new nqueen().solveNQueens(4));
    }
}
