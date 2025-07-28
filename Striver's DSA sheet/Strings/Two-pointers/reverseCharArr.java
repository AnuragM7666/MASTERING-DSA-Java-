
public class reverseCharArr {
    public static void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e' };
        reverse(arr);
        
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
