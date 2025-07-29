import java.util.ArrayList;
import java.util.Arrays;

public class twoSumZero {
    public ArrayList<ArrayList<Integer>> twoSum(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        Arrays.sort(arr);

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                ans.add(pair);
                i++;
                j--;
                while (i < j && arr[i] == arr[i - 1])
                    i++;
                while (i < j && arr[j] == arr[j + 1])
                    j--; // Skip duplicates
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        twoSumZero tsz = new twoSumZero();
        int[] arr = {-3, -1, 0, 1, 2, -1, 1, 3};
        ArrayList<ArrayList<Integer>> result = tsz.twoSum(arr);
        if (result.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs with sum zero:");
            for (ArrayList<Integer> pair : result) {
                System.out.println(pair);
            }
        }
    }
}
