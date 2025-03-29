import java.util.Arrays;
public class algo {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = 0;

        Arrays.sort(arr); // Sort the array before searching
        while (start <= end) {
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
            }
            return ans;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 9, 6, 7, 10, 4, 8};
        int target = 5;
        int result = binarySearch(arr, target);

        System.out.println(result);
    }
    
}