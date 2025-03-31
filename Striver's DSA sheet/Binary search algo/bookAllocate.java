// You are given an array arr[] of size n, where arr[i] represents the number of pages in the i-th book.
// There are m students, and the books must be allocated to students such that:
//Each student gets at least one book.
//Each book can be allocated to exactly one student.
//The maximum number of pages allocated to any student is minimized.
//Your task is to find the minimum possible maximum pages a student has to read when the books are allocated optimally.
public class bookAllocate {
    public static boolean isValid(int[] arr, int n, int m, int maxAllowedPages) {
        int students = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxAllowedPages) {
                return false;
            }

            if (arr[i] + pages <= maxAllowedPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }
        if (students > m) {
            return false;
        } else {
            return true;
        }
    }

    public static int allocateBooks(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        int ans = -1;

        int start = 0;
        int end = sum;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(isValid(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int m = 2; 
        int result = allocateBooks(arr, n, m);
        if (result != -1) {
            System.out.println("The minimum number of pages that can be allocated is: " + result);
        } else {
            System.out.println("Not enough books to allocate to students.");
        }
    }
}
