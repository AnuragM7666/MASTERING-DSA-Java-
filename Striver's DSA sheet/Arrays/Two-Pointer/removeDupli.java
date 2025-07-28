public class removeDupli {
    public int[] rem(int[] arr) {
        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j < n) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        int[] uniqueArr = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            uniqueArr[k] = arr[k];
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        
        removeDupli obj = new removeDupli();
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int[] result = obj.rem(arr);

        for (int i = 0; i <= result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
