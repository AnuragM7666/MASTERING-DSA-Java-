// You are given an array Arr of integers of size N. Your task is to compute a special sum defined as follows:
// First, sort the array in non-decreasing order.
// Let mid be the middle index of the sorted array (i.e., mid = N / 2).
// Add all elements from index mid to the end of the array to the sum.
// Then, for each pair of elements symmetrically placed around the middle:
// If the array size is even, start with the two middle elements at indices (mid - 1) and mid.
// If the array size is odd, start with the elements at (mid - 1) and (mid + 1).
// Move outward from the center, and for each valid pair (i, j), compute the average:
// avg = (Arr[i] + Arr[j]) / 2
// Add this average to the sum.
// Output the final sum as an integer (use integer division for averaging).

import java.util.ArrayList;
import java.util.Arrays;

public class continuousMedian {
    public int findCM(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> temp=new ArrayList<>();
        for(int num:arr){
            temp.add(num);
        }
        int sum=0;
        while(!temp.isEmpty()){
            int n=temp.size();
            if(n%2==1){
                int mid=n/2;
                sum+=temp.get(mid);
                temp.remove(mid);
            }else{
                int mid=n/2;
                sum+=(temp.get(mid-1)+temp.get(mid))/2;
                temp.remove(mid-1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        continuousMedian cm = new continuousMedian();
        
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Result: " + cm.findCM(arr1));
        System.out.println();
        
        int[] arr3 = {7, 3, 9, 1, 5, 8};
        System.out.println("Array: " + Arrays.toString(arr3));
        System.out.println("Result: " + cm.findCM(arr3));
        System.out.println();
        
    }
}
