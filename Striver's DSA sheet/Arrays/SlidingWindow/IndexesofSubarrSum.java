import java.util.ArrayList;
//this code finds the starting and ending indexes of a subarray that sums to a given target value
public class IndexesofSubarrSum {
    public ArrayList<Integer> subarrSum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int st = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && st <= end) {
                sum -= arr[st];
                st++;
            }

            if (sum == target) {
                ans.add(st+1);
                ans.add(end+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        IndexesofSubarrSum obj = new IndexesofSubarrSum();
        int[] arr = { 1, 2, 3, 7, 5 };
        int target = 12;
        ArrayList<Integer> result = obj.subarrSum(arr, target);
        if (result.size() == 2) {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
