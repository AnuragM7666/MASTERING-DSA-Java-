//Given an array nums with n objects colored red, white, or blue, sort them in-place so that 
//objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
public class s1s2s{
    public static void sort(int[] arr) {
        // Dutch National Flag algorithm

        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        


        //optimized brute force approach

        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 0) {
        //         count0++;
        //     } else if (arr[i] == 1) {
        //         count1++;
        //     } else {
        //         count2++;
        //     }
        // }

        // int index = 0;
        // for (int i = 0; i < count0; i++) {
        //     arr[index++] = 0;
        // }
        // for (int i = 0; i < count1; i++) {
        //     arr[index++] = 1;
        // }
        // for (int i = 0; i < count2; i++) {
        //     arr[index++] = 2;
        // }
        // return 0;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 1, 0, 2, 0, 1, 2 };
        sort(arr);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}