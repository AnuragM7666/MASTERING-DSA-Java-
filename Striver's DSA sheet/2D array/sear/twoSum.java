//import java.util.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int firstNum = arr[i];
            int secNum = target - firstNum;

            if (map.containsKey(secNum)) {
                ans.add(i);
                ans.add(map.get(secNum));
                break;
            }
            map.put(firstNum, i);
        }
        
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;


        // Arrays.sort(arr); 
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        //     int sum = arr[start] + arr[end];
        //     if (sum == target) {
        //         //System.out.println("The two numbers are at: " + start + " and " + end + " indices");
        //         return indexOf(arr, arr[start]) + indexOf(arr, arr[end]);
        //     } else if (sum < target) {
        //         start++;
        //     } else {
        //         end--;
        //     }
        // }return -1; // Return -1 if no such indices are found

        //Brute Force Approach
        // for (int i = 0; i < arr.length; i++) {
        //     int firstNum = arr[i];
        //     for (int j = i + 1; j < arr.length; j++) {
        //         int secondNum = arr[j];
        //         int sum = firstNum + secondNum;
        //         if (target == sum) {
        //             System.out.println("The two numbers are at: " + i + " and " + j + "indices");
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 5,2,11,7,15 };
        int target = 9;
        int[] twoNum = twoSum(arr, target);
        System.out.println("Indices: " + twoNum[0] + ", " + twoNum[1]);
    }
}
