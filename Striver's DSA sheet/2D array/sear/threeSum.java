import java.util.*;
public class threeSum {
    public List<List<Integer>> thSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(arr);
        //two-pointer approach
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplet);
                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        //Using hashset
        // for (int i = 0; i < n; i++) {
        //     int target = -arr[i];
        //     Set<Integer> s = new HashSet<>();
        //     for (int j = i + 1; j < n; j++) {
        //         int third=target-arr[j];
        //         if (s.contains(third)) {
        //             List<Integer> triplet = Arrays.asList(arr[i], arr[j], third);
        //             Collections.sort(triplet); // Sort to avoid duplicates
        //             result.add(triplet);
        //         }
        //         s.add(arr[j]);
        //     }
        // }
        //Brute force approach
        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i+1; j < n - 1; j++) {
        //         for (int k = j+1; k < n; k++) {
        //             if (arr[i] + arr[j] + arr[k] == 0) {
        //                 Vector<Integer> triplet = new Vector<>();
        //                 triplet.add(arr[i]);
        //                 triplet.add(arr[j]);
        //                 triplet.add(arr[k]);
        //                 Collections.sort(triplet);  
        //                 result.add(triplet);
        //             }
        //         }
        //     }
        // }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        threeSum ts = new threeSum();
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = ts.thSum(arr);
        System.out.println("Triplets that sum to zero: " + result);
    }
}
