// This code removes all occurrences of 0 from an array and shifts the non-zero elements to the front.
public class removeO {
    public void rem(int[] arr) {
        int j = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        removeO obj = new removeO();
        int[] arr = { 0, 1, 0, 3, 12, 0, 5 };
        obj.rem(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
