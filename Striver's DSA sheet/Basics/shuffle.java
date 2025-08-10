//this code is to shuffle an array of size 2n into a new array of size 2n
// where the first half contains the first n elements and the second half contains the last n elements
public class shuffle {
    public int[] suff(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = arr[i];
            ans[j++] = arr[i + n];
        }
        return ans;
    }
    public static void main(String[] args) {
        shuffle s = new shuffle();
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = arr.length / 2;
        int[] shuffledArray = s.suff(arr, n);
        
        System.out.print("Shuffled array: ");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
