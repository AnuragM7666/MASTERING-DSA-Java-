//You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2].
 //Each integer appears exactly once except a which appears twice and b which is missing.
 // The task is to find the repeating and missing numbers a and b.

//Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
import java.util.*;
public class missRepe {
    public static int[] findMissingAndRepeating(int[][] arr) {
        int n = arr.length;
        Vector<Integer> ans = new Vector<>();
        Set<Integer> set = new HashSet<>();
        int a = 0, b = 0;
        int actualSum = 0, expectedSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set.contains(arr[i][j])) {
                    a = arr[i][j];
                    ans.add(a);
                }
                set.add(arr[i][j]);
                actualSum += arr[i][j];
            }
        }
        expectedSum = (n * n) * (n * n + 1) / 2;
        b = expectedSum - (actualSum - a);
        ans.add(b);

        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 5 }, { 7, 8, 9 } };

        int[] result = findMissingAndRepeating(arr);
        System.out.println("Repeating number: " + result[0]);

        System.out.println("Missing number: " + result[1]);
    }
}