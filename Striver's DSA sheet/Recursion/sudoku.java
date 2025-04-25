//Write a program to solve a Sudoku puzzle by filling the empty cells.
//A sudoku solution must satisfy all of the following rules:
//Each of the digits 1-9 must occur exactly once in each row.
//Each of the digits 1-9 must occur exactly once in each column.
//Each of the digits 1-9 must occur exactly once in each of the 9 3 x3 sub-boxes of the grid.
//The'.'character indicates empty cells.
import java.util.Arrays;
public class sudoku {
    public boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == ch) {
                return false;
            }
        }
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
        }
    
    public boolean sudokuSolver(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        
        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9) {
            nextRow++;
            nextCol = 0;
        }
        if (board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }
    public static void main(String[] args) {
        sudoku s = new sudoku();
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        s.solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
