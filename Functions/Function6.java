import java.util.*;

//write a function that takes age as input and returns if that person is eligible to vote or not
public class Function6 {
    public static boolean isEligible(int age) {

        if (age > 18) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(isEligible(age));
    }
}
