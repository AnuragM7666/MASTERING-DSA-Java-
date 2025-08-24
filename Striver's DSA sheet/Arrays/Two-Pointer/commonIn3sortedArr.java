import java.util.ArrayList;
import java.util.List;

public class commonIn3sortedArr {
    List<Integer> common(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3){
        int i=0,j=0,k=0;
        int n1=arr1.size();
        int n2=arr2.size();
        int n3=arr3.size();

        List<Integer> ans=new ArrayList<>();

        while(i<n1 && j<n2 && k<n3){
            int a=arr1.get(i);
            int b=arr2.get(j);
            int c=arr3.get(k);

            if(a==b && b==c){
                ans.add(a);
                int val=a;
                while(i<n1 && arr1.get(i)==val) i++;
                while(j<n2&& arr2.get(j)==val) j++;
                while(k<n3 && arr3.get(k)==val) k++;
            }else{
                int min=Math.min(a, Math.min(b,c));
                if(a==min){
                    int val=min;
                    while(i<n1 && arr1.get(i)==val) i++;
                }
                if(b==min){
                    int val=min;
                    while(j<n2&& arr2.get(j)==val) j++;
                }
                if(c==min){
                    int val=min;
                    while(k<n3 && arr3.get(k)==val) k++;
                }
            }
        }
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        commonIn3sortedArr com = new commonIn3sortedArr();
        
        // Create three sorted arrays
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        arr3.add(7);
        
        // Find common elements
        List<Integer> result = com.common(arr1, arr2, arr3);
        
        // Print the arrays
        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);
        System.out.println("Array 3: " + arr3);
        
        // Print the result
        if (result.get(0) == -1) {
            System.out.println("No common elements found");
        } else {
            System.out.println("Common elements: " + result);
        }
        
        // Test case with duplicates
        System.out.println("\n--- Test with duplicates ---");
        List<Integer> arr4 = new ArrayList<>();
        arr4.add(1);
        arr4.add(1);
        arr4.add(2);
        arr4.add(2);
        arr4.add(3);
        
        List<Integer> arr5 = new ArrayList<>();
        arr5.add(1);
        arr5.add(2);
        arr5.add(2);
        arr5.add(3);
        arr5.add(4);
        
        List<Integer> arr6 = new ArrayList<>();
        arr6.add(1);
        arr6.add(2);
        arr6.add(3);
        arr6.add(3);
        arr6.add(5);
        
        List<Integer> result2 = com.common(arr4, arr5, arr6);
        
        System.out.println("Array 4: " + arr4);
        System.out.println("Array 5: " + arr5);
        System.out.println("Array 6: " + arr6);
        
        if (result2.get(0) == -1) {
            System.out.println("No common elements found");
        } else {
            System.out.println("Common elements: " + result2);
        }
    }
}
