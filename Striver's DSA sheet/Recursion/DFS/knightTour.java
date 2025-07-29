package DFS;
//There is a knight on an n x n chessboard. In a valid configuration, 
//the knight starts at the top-left cell of the board and visits every cell on the board exactly once.
//You are given an n x n integer matrix grid consisting of distinct integers from the range[0,n*n-1]
//where grid[row][col]indicates that the cell(row,col)is the grid[row][col]th cell that the knight visited.
//The moves are 0-indexed.
//Return true if grid represents a valid configuration of the knight'smovements or false otherwise.
//Note that a valid knight move consists of moving two squares vertically and one square horizontally,
//or two squares horizontally and one square vertically.The figure below illustrates all the possible eight moves of a knight from some cell.

public class knightTour {
    public boolean isValid(int[][] grid, int r, int c, int n, int expVal) {
        if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != expVal) {
            return false;
        }
        if (expVal == (n * n - 1)) {
            return true;
        }

        boolean ans1 = isValid(grid, r - 2, c + 1, n, expVal + 1);
        boolean ans2 = isValid(grid, r - 1, c + 2, n, expVal + 1);
        boolean ans3 = isValid(grid, r + 1, c + 2, n, expVal + 1);
        boolean ans4 = isValid(grid, r + 2, c + 1, n, expVal + 1);
        boolean ans5 = isValid(grid, r + 2, c - 1, n, expVal + 1);
        boolean ans6 = isValid(grid, r + 1, c - 2, n, expVal + 1);
        boolean ans7 = isValid(grid, r - 1, c - 2, n, expVal + 1);
        boolean ans8 = isValid(grid, r - 2, c - 1, n, expVal + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    public boolean knight(int[][] grid) {
        return isValid(grid, 0, 0, grid.length, 0);
    }

    public static void main(String[] args) {
        
        knightTour kt = new knightTour();
        int[][] grid = {
                { 0, 7, 2 }, 
                { 3, 4, 1 },
                { 6, 5, 8 }

        //{0, 11, 16, 5, 20},
        //{17, 4, 21, 10, 15}, returns true;
        //{12, 1, 8, 19, 6},
        //{3, 18, 23, 14, 9},
        //{24, 13, 2, 7, 22}
        };
        boolean result = kt.knight(grid);
        System.out.println(result ? "Knight's tour is possible" : "Knight's tour is not possible");
    }
}
