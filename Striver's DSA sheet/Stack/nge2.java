//The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. 
//If there is no next greater element, then the answer for this query is -1.
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class nge2 {
    public ArrayList<Integer> nextGE2(int[] arr1, int[] arr2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = arr2.length;

        for (int i = n - 1; i >= 0; i--) {
            while (s.size() > 0 && s.peek() <= arr2[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                h.put(arr2[i], -1);
            } else {
                h.put(arr2[i], s.peek());
            }
            s.push(arr2[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            ans.add(h.get(arr1[i]));
        }

        return ans;
    }
    public static void main(String[] args) {
        nge2 nge = new nge2();
        int[] arr1 = {4, 5, 2, 10, 8};
        int[] arr2 = {1, 3, 4, 2, 5, 10, 8};
        ArrayList<Integer> result = nge.nextGE2(arr1, arr2);
        System.out.println("Next Greater Elements: " + result);
    }
}
