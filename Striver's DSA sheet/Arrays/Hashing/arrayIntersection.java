
import java.util.HashSet;
import java.util.Set;

public class arrayIntersection {
    public int[] arr(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        arrayIntersection ai = new arrayIntersection();
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] intersection = ai.arr(nums1, nums2);

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        int[] intersection2 = ai.arr(nums3, nums4);
        System.out.println(java.util.Arrays.toString(intersection));
        System.out.println(java.util.Arrays.toString(intersection2));
    }
}
