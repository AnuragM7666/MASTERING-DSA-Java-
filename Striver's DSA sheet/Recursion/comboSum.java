//Given an array of distinct integers candidates and a target integer target, 
//return a list of all unique combinations of candidates where the chosen numbers sum to target. 
//You may return the combinations in any order.
//The same number may be chosen from candidates an unlimited number of times. 
//Two combinations are unique if the frequency of at least one of the chosen numbers is different.
//The test cases are generated such that the number of unique combinations that sum up to target is
// less than 150 combinations for the given input.
import java.util.*;
public class comboSum {
    Set<List<Integer>> set = new HashSet<>();
    public void findCombinations(int[] arr, int tar, int i, List<Integer> currCombo, List<List<Integer>> ans) {
        if (tar == 0) {
            List<Integer> sortedCombo = new ArrayList<>(currCombo);
            Collections.sort(sortedCombo); // Sort the combination to ensure uniqueness
            if(!set.contains(sortedCombo)) {
                set.add(sortedCombo);
                ans.add(new ArrayList<>(sortedCombo));
            }
            return;
        }
        if (tar < 0 || i >= arr.length) {
            return;
        }
        // Include the current element
        currCombo.add(arr[i]);
        findCombinations(arr, tar - arr[i], i + 1, currCombo, ans);
        findCombinations(arr, tar - arr[i], i, currCombo, ans);
        // Exclude the current element
        currCombo.remove(currCombo.size() - 1);
        findCombinations(arr, tar, i + 1, currCombo, ans);
    }

    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currCombo = new ArrayList<>();
        findCombinations(arr, tar, 0, currCombo, ans);
        return ans;
    }

    public static void main(String[] args) {
        comboSum cs = new comboSum();
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = cs.combinationSum(arr, target);
        System.out.println(result);
    }
}
