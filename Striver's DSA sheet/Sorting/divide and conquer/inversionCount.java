import java.util.Vector;
public class inversionCount {
    public int merge(int[] arr, int st, int mid, int end) {
        int i = st;
        int j = mid + 1;
        Vector<Integer> temp = new Vector<>();
        int InvCount = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
                InvCount += (mid - i + 1);
            }
        }
        
        while(i<=mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }
        
        for(int k = st; k <= end; k++) {
            arr[k] = temp.get(k - st);
        }
        return InvCount;

    }

    public int mergeSort(int[] arr, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;

            int leftInvCount = mergeSort(arr, st, mid);
            int rightInvCount = mergeSort(arr, mid + 1, end);

            int mergeInvCount = merge(arr, st, mid, end);

            return leftInvCount + rightInvCount + mergeInvCount;
        }
        return 0;
    }
    public static void main(String[] args) {
        inversionCount obj = new inversionCount();
        int[] arr = { 1, 20, 6, 4, 5 };
        int n = arr.length;
        int result = obj.mergeSort(arr, 0, n - 1);
        System.out.println("Number of inversions are: " + result);
    }
} 
