//You are given a string s. Your task is to determine if the string is a palindrome.
// A string is considered a palindrome if it reads the same forwards and backwards.
import java.util.Scanner;

public class Pali {
    public static boolean isPalindrome(String s){
        String reverse="";
        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
