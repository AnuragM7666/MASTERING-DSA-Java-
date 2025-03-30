//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.

public class MountainArr {
    public static int Mountainpeak(int[] arr) {
        //Brute-force approach

        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
        //         return i;
        //     }
        // }
        // return -1;

        //Optimized approach

        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 2, 1 };
        int peakIndex = Mountainpeak(arr);
        System.out.println("The peak index is: " + peakIndex);
    }
}