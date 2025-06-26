public class RevArrGroups {
    public void revArr(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i+=k) {
            int st = i;
            int end = Math.min(i + k - 1, n - 1);

            while (st < end) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;

                st++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        RevArrGroups obj = new RevArrGroups();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3; 
        obj.revArr(arr, k);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
