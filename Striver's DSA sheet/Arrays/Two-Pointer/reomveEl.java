//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
//The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted, 
//you need to do the following things:
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
// The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class reomveEl {
    public int rem(int[] arr, int val) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] == val) {
                arr[i] = arr[j];
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        reomveEl obj = new reomveEl();
        int[] arr = { 3, 2, 2, 3, 4, 5 };
        int val = 3;
        int newLength = obj.rem(arr, val);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
