public class shortestUnsortedContiSubarr {
    public int sorted(int[] arr){
        int n = arr.length;
        
        int left = -1;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < max){
                left = i;
            } else {
                max = arr[i];
            }
        }

        int right = -1;
        int min = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > min){
                right = i;
            } else {
                min = arr[i];
            }
        }
        
        if(left == -1) return 0;
        
        return left - right + 1;
    }
    
    public static void main(String[] args) {
        shortestUnsortedContiSubarr solution = new shortestUnsortedContiSubarr();
        int[] arr1 = {2, 6, 4, 8, 10, 9, 15};
        System.out.println("Array 1: [2,6,4,8,10,9,15]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr1));
        System.out.println("Expected: 5 (subarray [6,4,8,10,9] needs to be sorted)");
        System.out.println();
        
        // Test case 2: [1,2,3,4] - already sorted
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Array 2: [1,2,3,4]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr2));
        System.out.println("Expected: 0 (already sorted)");
        System.out.println();
        
        // Test case 3: [1] - single element
        int[] arr3 = {1};
        System.out.println("Array 3: [1]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr3));
        System.out.println("Expected: 0 (single element is always sorted)");
        System.out.println();
        
        // Test case 4: [5,4,3,2,1] - completely unsorted
        int[] arr4 = {5, 4, 3, 2, 1};
        System.out.println("Array 4: [5,4,3,2,1]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr4));
        System.out.println("Expected: 5 (entire array needs to be sorted)");
        System.out.println();
        
        // Test case 5: [1,3,2,4,5]
        int[] arr5 = {1, 3, 2, 4, 5};
        System.out.println("Array 5: [1,3,2,4,5]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr5));
        System.out.println("Expected: 2 (subarray [3,2] needs to be sorted)");
        System.out.println();
        
        // Test case 6: [1,2,3,3,3]
        int[] arr6 = {1, 2, 3, 3, 3};
        System.out.println("Array 6: [1,2,3,3,3]");
        System.out.println("Shortest unsorted subarray length: " + solution.sorted(arr6));
        System.out.println("Expected: 0 (already sorted)");
    }
}
