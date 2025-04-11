import java.util.*;
public class threeSum {
    public List<List<Integer>> thSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        Vector<Integer> triplet = new Vector<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);  
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        threeSum ts = new threeSum();
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = ts.thSum(arr);
        System.out.println("Triplets that sum to zero: " + result);
    }
}
