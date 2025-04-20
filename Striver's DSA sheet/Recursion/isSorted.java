public class isSorted {
    public static boolean sorted(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        return (arr[n - 1] > arr[n - 2] && sorted(arr, n - 1));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 5 };
        System.out.println(sorted(arr, arr.length));
    }
}
