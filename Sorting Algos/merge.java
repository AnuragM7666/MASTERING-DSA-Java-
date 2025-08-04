import java.util.Vector;

public class merge {
    public void merging(Vector<Integer> arr, int st, int mid, int end) {
        int i = st;
        int j = mid + 1;
        Vector<Integer> temp = new Vector<>();
        
        while (i <= mid && j <= end) {
            if (arr.get(i) < arr.get(j)) {
                temp.add(arr.get(i));
                i++;
            } else {
                temp.add(arr.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr.get(i));
            i++;
        }
        
        while (j <= end) {
            temp.add(arr.get(j));
            j++;
        }

        for (int k = st; k <= end; k++) {
            arr.set(k, temp.get(k - st));
        }
    }

    public void mergeSort(Vector<Integer> arr, int st, int end) {
        int mid = st + (end - st) / 2;

        if (st < end) {
            mergeSort(arr, st, mid - 1);
            mergeSort(arr, mid + 1, end);
            merging(arr, st, mid, end);
        }
    }
    public static void main(String[] args) {
        merge m = new merge();
        Vector<Integer> arr = new Vector<>();
        arr.add(12);
        arr.add(11);
        arr.add(13);
        arr.add(5);
        arr.add(6);
        
        System.out.println("Original array: " + arr);
        m.mergeSort(arr, 0, arr.size() - 1);
        System.out.println("Sorted array: " + arr);
    }
}
