//Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
//The solution set must not contain duplicate subsets. Return the solution in any order.
import java.util.*;

public class subset2 {
    public static void getAllSubsets(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans ){
        if(i==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(arr[i]);
        getAllSubsets(arr, i+1, curr, ans);
        curr.remove(curr.size()-1);

        int idx=i+1;
        while(idx<arr.length && arr[idx]==arr[idx-1]) idx++;
        getAllSubsets(arr, idx, curr, ans);

    }

    public List<List<Integer>> subsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        getAllSubsets(arr, 0, curr, ans);

        for (List<Integer> subset : ans) {
            System.out.println(subset);
        }

        return new ArrayList<>(ans);
    }
    public static void main(String[] args) {
        subset2 obj = new subset2();
        int[] arr = {1, 2, 2};
        obj.subsets(arr);
    }
}
