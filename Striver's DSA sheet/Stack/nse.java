import java.util.Stack;

public class nse {
    public int[] nSe(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        nse nse = new nse();
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nse.nSe(arr);
        System.out.print("Next Smaller Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}