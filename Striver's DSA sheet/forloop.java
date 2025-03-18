
import java.util.Scanner;

public class forloop {
    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int prev = 1;
        int curr = 1;
        int next;
        for (int i = 3; i <= n; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
        sc.close();
    }
}
