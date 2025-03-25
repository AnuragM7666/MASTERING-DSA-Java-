public class largest {
    public static int Largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] > largest) {
            //     largest = arr[i];
            // }
            largest = Math.max(largest, arr[i]);
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(Largest(arr));
    }
}
