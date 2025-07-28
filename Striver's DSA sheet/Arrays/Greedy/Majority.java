package Greedy;
// import java.util.Arrays;
public class Majority {
    public static int MajorityElement(int[] arr) {
        //BRUTE-FORCE approach

        // for (int val : arr) {
        //     int freq = 0;
        //     for (int ele : arr) {
        //         if (val == ele) {
        //             freq++;
        //         }
        //     }
        //     if (freq > arr.length / 2) {
        //         return val;
        //     }
        // }
        // return -1;


        int n = arr.length;

        int freq = 0;
        int major = 0;
//MOORE's algorithm
        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                major = arr[i];
                freq = 1;
            }
            if (arr[i] == major) {
                freq++;
            } else {
                freq--;
            }
        }
        return major;



        //using sorting technique

        // Arrays.sort(arr);
        // int frequency = 1;
        // int major = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] == arr[i - 1]) {
        //         frequency++;
        //     } else {
        //         frequency = 1;
        //         major = arr[i];
        //     }
        //     if (frequency > n / 2) {
        //         return major;
        //     }
        // }
        // return major;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 4, 4};
        int result = MajorityElement(arr);
        System.out.println(result);
    }
}
