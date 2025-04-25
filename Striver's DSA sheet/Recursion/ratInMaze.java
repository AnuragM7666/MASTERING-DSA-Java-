import java.util.*;

public class ratInMaze {
    public void ratMaze(Vector<Vector<Integer>> mat, int row, int col, String path, Vector<String> ans,
            Vector<Vector<Boolean>> visited) {
        int n=mat.size();
        int m = mat.get(0).size();
        
        if(row<0 || col<0 || row>=n || col>=m || mat.get(row).get(col)==0 || visited.get(row).get(col)){
            return;
        }
        if (row == n - 1 && col == m - 1) {
            ans.add(path);
            return;
        }
        visited.get(row).set(col, true);
        ratMaze(mat, row, col + 1, path + "R", ans, visited);
        ratMaze(mat, row + 1, col, path + "D", ans, visited);
        ratMaze(mat, row, col - 1, path + "L", ans, visited);
        ratMaze(mat, row - 1, col, path + "U", ans, visited);
        visited.get(row).set(col, false);
    }

    public Vector<String> findPath(Vector<Vector<Integer>> mat) {
        Vector<String> ans = new Vector<>();
        String path = "";
        int n = mat.size();
        int m = mat.get(0).size();
        Vector<Vector<Boolean>> visited = new Vector<>();
        for (int i = 0; i < n; i++) {
            visited.add(new Vector<>(Collections.nCopies(m, false)));
        }

        ratMaze(mat, 0, 0, path, ans, visited);
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
