//Given an array of integers nums which is sorted in ascending order,and an integer target
//,write a function to search target in nums.If target exists,then return its index.Otherwise,return-1.
//You must write an algorithm with O(log n)runtime complexity.
public class binarySearch {
    public static int bs(int[] arr, int tar, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] < tar) {
                return bs(arr, tar, mid + 1, end);
            } else {
                return bs(arr, tar, st, mid - 1);
            }
        }
        return -1; 
    }

    public int search(int[] arr, int tar) {
        return bs(arr, tar, 0, arr.length - 1);
    }
    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int tar = 5;
        int result = bs.search(arr, tar);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {    
            System.out.println("Element is not present in array");
        }
    }
}
