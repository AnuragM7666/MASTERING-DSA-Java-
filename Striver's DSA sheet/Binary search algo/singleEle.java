public class singleEle {
    public static int singleElinArr(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        if (n == 1) {
            return arr[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            if (mid == 0 && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (mid == n - 1 && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6};
        int singleElement = singleElinArr(arr);
        System.out.println("The single element in the array is: " + singleElement);
    }
}
