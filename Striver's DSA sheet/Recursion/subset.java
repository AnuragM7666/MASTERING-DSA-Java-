import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void printSubsets(int[] arr, int i, List<Integer> current, List<List<Integer>> ans) {
        if (i == arr.length) {
            ans.add(new ArrayList<>(current)); // Save a copy of the current subset
            return;
        }

        // Include the current element
        current.add(arr[i]);
        printSubsets(arr, i + 1, current, ans);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        printSubsets(arr, i + 1, current, ans);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        printSubsets(arr, 0, new ArrayList<>(), ans);

        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }
    }
}
