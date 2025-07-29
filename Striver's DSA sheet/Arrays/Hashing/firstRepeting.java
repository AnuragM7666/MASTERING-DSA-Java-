//Given an array arr[], find the first repeating element. 
//The element should occur more than once and the index of its first occurrence 
//should be the smallest.
import java.util.HashMap;
import java.util.Map;
public class firstRepeting {
    public int firstRepeating(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int val:arr){
        map.put(val, map.getOrDefault(val, 0) + 1);
    }
    
    for(int i = 0;i<arr.length;i++){
        if (map.get(arr[i]) > 1) {
            return arr[i];
        }
    }
    return -1;
}

    public static void main(String[] args) {
        firstRepeting fr = new firstRepeting();
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(fr.firstRepeating(arr)); 
    }
}