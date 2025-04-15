import java.util.*;
public class fourSum {
    public static List<List<Integer>> sumFor(int[] arr, int tar) {
        int n = arr.length;
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int p = j + 1;
                int q = n - 1;
                while (p < q) {
                    long sum = (long) arr[i] + arr[j] + arr[p] + arr[q];
                    if (sum < tar) {
                        p++;
                    } else if (sum > tar) {
                        q--;
                    } else {
                        List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[p], arr[q]);
                        result.add(quad);
                        p++;
                        q--;
                        while (p < q && arr[p] == arr[p + 1])
                            p++;
                            while (p < q && arr[q] == arr[q + 1])
                            q--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> result = sumFor(arr, target);
        System.out.println(result);
    }
}
