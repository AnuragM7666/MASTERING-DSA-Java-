import java.util.Arrays;
public class insertion {
    public static int insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int n = arr.length;
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        insertionSort(arr, n);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
