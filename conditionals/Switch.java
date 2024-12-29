import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operator = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("invalid division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("invalid division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
