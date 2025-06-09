//Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
// return the next greater number for every element in nums.
//The next greater number of a number x is the first greater number to its traversing-order next 
//in the array,which means you could search circularly to find its next greater number.
//If it doesn'texist,return-1 for this number.

import java.util.Stack;

public class nge3 {
    public int[] nextG(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (s.size() > 0 && arr[s.peek()] <= arr[i % n]) {
                s.pop();
            }

            ans[i % n] = s.empty() ? -1 : arr[s.peek()];

            s.push(i % n);
        }
        return ans;
    }
    public static void main(String[] args) {
        nge3 nge = new nge3();
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nge.nextG(arr);
        System.out.print("Next greater elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    
    }
}
