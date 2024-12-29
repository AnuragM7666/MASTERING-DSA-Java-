import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        System.out.println(reversedNum);
        if (reversedNum == originalNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}