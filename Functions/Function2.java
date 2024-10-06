import java.util.*;

public class Function2 {
    public static int CalculateSum(int a, int b) {
        int Sum = a + b;
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println(sum);
    }
}
