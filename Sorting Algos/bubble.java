import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swaps;

        for (int i = 0; i < n - 1; i++) {
            swaps = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = true;
                }
            }
            if (!swaps) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}