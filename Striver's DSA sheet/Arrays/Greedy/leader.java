package Greedy;
//You are given an array arr of positive integers. 
//Your task is to find all the leaders in the array. 
//An element is considered a leader if it is greater than or equal to all elements to its right.
// The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.Collections;

public class leader {
    public ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int rightMax = arr[n - 1];
        ans.add(rightMax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > rightMax) {
                rightMax = arr[i];
                ans.add(rightMax);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        leader l = new leader();
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = l.leaders(arr);
        System.out.println(result); 
    }
}