import java.util.ArrayList;
import java.util.HashMap;

public class commonInTwo {
    int[] Intersect(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> temp=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int num:arr1){
            temp.put(num, temp.getOrDefault(num, 0)+1);
        }

        for(int val:arr2){
            if(temp.getOrDefault(val, 0)>0){
                ans.add(val);
                temp.put(val, temp.get(val)-1);
            }
        }

        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        commonInTwo solution = new commonInTwo();
        
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        
        System.out.println("Test Case 1:");
        System.out.println("Array 1: [1, 2, 2, 1]");
        System.out.println("Array 2: [2, 2]");
        
        int[] result1 = solution.Intersect(arr1, arr2);
        System.out.print("Intersection: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        int[] arr3 = {4, 9, 5};
        int[] arr4 = {9, 4, 9, 8, 4};
        
        System.out.println("\nTest Case 2:");
        System.out.println("Array 1: [4, 9, 5]");
        System.out.println("Array 2: [9, 4, 9, 8, 4]");
        
        int[] result2 = solution.Intersect(arr3, arr4);
        System.out.print("Intersection: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {4, 5, 6};
        
        System.out.println("\nTest Case 3:");
        System.out.println("Array 1: [1, 2, 3]");
        System.out.println("Array 2: [4, 5, 6]");
        
        int[] result3 = solution.Intersect(arr5, arr6);
        System.out.print("Intersection: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
