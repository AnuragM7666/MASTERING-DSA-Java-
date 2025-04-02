public class mergeSortedarr {
    public static void mergeSortedArrays(int[] A, int m, int[] B, int n) {
        int idx = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[idx--] = A[i--]; //A[idx] = A[i]; idx--; i--; 
            } else {
                A[idx--] = B[j--]; //A[idx] = B[j]; idx--; j--;
            }
        }
        while (j >= 0) {
            A[idx--] = B[j--];
        }
    }
    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 0, 0, 0 };
        int m = 3;
        int[] B = { 2, 4, 6 };
        int n = 3;
        mergeSortedArrays(A, m, B, n);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
