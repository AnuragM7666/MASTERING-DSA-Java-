import java.util.*;

public class ratInMaze {
    public void ratMaze(Vector<Vector<Integer>> mat, int row, int col, String path, Vector<String> ans
            ) {
        int n=mat.size();
        int m = mat.get(0).size();
        
        if(row<0 || col<0 || row>=n || col>=m || mat.get(row).get(col)==0 || mat.get(row).get(col)==-1) {
            return;
        }
        if (row == n - 1 && col == m - 1) {
            ans.add(path);
            return;
        }
        mat.get(row).set(col, -1); //visited
        ratMaze(mat, row, col + 1, path + "R", ans );
        ratMaze(mat, row + 1, col, path + "D", ans);
        ratMaze(mat, row, col - 1, path + "L", ans);
        ratMaze(mat, row - 1, col, path + "U", ans);
        mat.get(row).set(col, 1); // Backtrack to mark the cell as unvisited
    }

    public Vector<String> findPath(Vector<Vector<Integer>> mat) {
        Vector<String> ans = new Vector<>();
        String path = "";
        int n = mat.size();
        int m = mat.get(0).size();

        ratMaze(mat, 0, 0, path, ans);
        return ans;
    }
    public static void main(String[] args) {
        ratInMaze r = new ratInMaze();
        Vector<Vector<Integer>> mat = new Vector<>();
        mat.add(new Vector<>(Arrays.asList(1, 0, 0, 0)));
        mat.add(new Vector<>(Arrays.asList(1, 1, 0, 1)));
        mat.add(new Vector<>(Arrays.asList(1, 1, 0, 0)));
        mat.add(new Vector<>(Arrays.asList(0, 1, 1, 1)));
        
        Vector<String> result = r.findPath(mat);
        System.out.println(result);
    }
}
