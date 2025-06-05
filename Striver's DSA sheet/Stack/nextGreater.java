//Given an array arr[ ] of integers, the task is to find the next greater element for each element 
//of the array in order of their appearance in the array. 
//Next greater element of an element in the array is the nearest element on the right 
//which is greater than the current element.
//If there does not exist next greater of current element, 
//then next greater element for current element is -1. 
//For example, next greater of the last element is always -1.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreater {
    public ArrayList<Integer> nextG(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = n - 1; i >= 0; i--) {
            while (s.size() > 0 && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans.set(i, -1);
            } else {
                ans.set(i, s.peek());
            }
            s.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        nextGreater ng = new nextGreater();
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> result = ng.nextG(arr);
        System.out.println("Next Greater Elements: " + result);
    }
}
