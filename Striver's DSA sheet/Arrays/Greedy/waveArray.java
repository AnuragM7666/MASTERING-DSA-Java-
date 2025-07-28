import java.util.Arrays;
//wave array is an array where every even index element is greater than or equal to its adjacent odd index elements and every odd index element is less than or equal to its adjacent even index elements.
public class waveArray {
    public void wave(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }
    public static void main(String[] args) {
        waveArray obj = new waveArray();
        int[] arr = {1, 2, 3, 4, 5};
        obj.wave(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}