//The Painter’s Partition Problem is a classic problem in binary search and dynamic programming. 
//It involves dividing a board into sections to minimize the maximum workload assigned to a painter.
//You are given:
//N boards of different or equal lengths.
//K painters who can paint the boards.
//A painter takes 1 unit of time to paint 1 unit of board.
//The goal is to assign boards to painters such that the maximum time any painter spends is minimized.
public class painter {
    public static boolean isPossible(int[] arr, int n,int m, int maxAllowedTime) {
        int time = 0;
        int painters = 1;

        for (int i = 0; i < n; i++) {
            if (time + arr[i] <= maxAllowedTime) {
                time += arr[i];
            } else {
                painters++;
                time = arr[i];
            }
        }
        if(painters <= m) {
            return true;
        } else {
            return false;
        }
    }

    public static int problem(int[] arr, int n, int m) {
        int start = Math.max(arr[0], arr[n - 1]);
        int end = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            end += arr[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int m = 2;
        int result = problem(arr, n, m);
        System.out.println("Minimum time required is " + result);
    }
}
