import java.util.Arrays;
//this is the code for left rotation of an array with k elements
public class rotateArr{
    private static void rot(int[] arr, int st, int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;

        rot(arr, 0, k-1);
        rot(arr, k, n-1);
        rot(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}