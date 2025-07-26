// This code finds all elements in an array that appear more than n/3 times.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class majority2 {
    public List<Integer> major(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        majority2 obj = new majority2();
        int[] arr = { 1, 2, 3, 4, 4, 2, 2, 4, 4, 2, 2, 4, 4 };
        List<Integer> result = obj.major(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
