//Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
//
//A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
//Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.
import java.util.Scanner;

public class Count {
    static int evenlyDivides(int n){
        int count=0;
        int a=n;

        while(a>0){
            int rem=a%10;
            if(rem!=0 && n%rem==0){
                count++;
            }
            a=a/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int result = evenlyDivides(n);
        System.out.println(result);
        sc.close();
    }
}
