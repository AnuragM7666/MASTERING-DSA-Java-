//Given an integer array nums, return an array answer such that answer[i] is equal to 
//the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
public class ProductItself {
    public static int[] ArrProdExceIt(int[] nums) {
        int n = nums.length;
        int[] prod = new int[n];
        int suffix = 1;

        for(int i = 0; i < n; i++) {
            prod[i] = 1;
        }
        //prefix product
        for (int i = 1; i < n; i++) {
            prod[i] = prod[i - 1] * nums[i - 1];
        }
        //suffix product
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            prod[i] *= suffix;
        }

        //Brute force approach

        // for (int i = 0; i < n; i++) {
        //     prod[i] = 1;
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i != j) {
        //             prod[i] *= nums[j];
        //         }
        //     }
        // }
        return prod;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] result = ArrProdExceIt(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
