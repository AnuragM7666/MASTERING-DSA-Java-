//sum of N natural numbers
import java.util.*;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int Sum = 0;
        int i = 1;

        while (i <= n) {
            Sum = Sum + i;
            i++;
        }
        System.out.println("Your Sum is:" + Sum);
    }
}