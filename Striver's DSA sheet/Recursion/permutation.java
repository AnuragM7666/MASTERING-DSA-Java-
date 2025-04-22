//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
import java.util.*;

public class permutation {
    public static void getPerms(int[] arr, int idx, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> curr = new ArrayList<>();
            for (int num : arr) {
                curr.add(num); 
            }
            ans.add(curr);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            getPerms(arr, idx + 1, ans);

            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        getPerms(arr, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3 };
        List<List<Integer>> permutations = permute(input);
        System.out.println(permutations);
    }
}
