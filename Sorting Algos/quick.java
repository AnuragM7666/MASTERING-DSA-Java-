public class quick {
    public static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }

    public void QuickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivIdx = partition(arr, st, end);
            QuickSort(arr, st, pivIdx - 1);
            QuickSort(arr, pivIdx + 1, end);
        }
    }
    public static void main(String[] args) {
        quick q = new quick();
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        q.QuickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
