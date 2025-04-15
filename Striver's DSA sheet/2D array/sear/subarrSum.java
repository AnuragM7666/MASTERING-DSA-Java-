//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
import java.util.*;;
public class subarrSum {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        int[] psum = new int[n];
        psum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int j = 0; j < n; j++) {
            if (psum[j] == k) {
                count++;
            }

            int val = psum[j] - k;

            if (m.containsKey(val)) {
                count += m.get(val);
            }

            if (m.containsKey(psum[j])) {
                m.put(psum[j], m.get(psum[j]) + 1);
            } else {
                m.put(psum[j], 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        subarrSum s = new subarrSum();

        int[] arr = { 9, 4, 0, 20, 3, 10, 5 };
        int k = 33;

        int result = s.subarraySum(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
