//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.
public class XOR {
    public static int findSingleEle(int[] nums) {
        int result = 0;
        for (int num : nums) { //for each loop
            result ^= num; // XOR operation of all nums // XOR of a number with itself is 0 // XOR of a
                           // number with 0 is the number itself

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 5, 4, 3, 2};
        System.out.println(findSingleEle(nums));
    }
}
