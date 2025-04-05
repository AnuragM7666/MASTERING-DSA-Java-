import java.util.Scanner;

public class Mystrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "Hello";
        String str2 = "World";

        String str3 = str + " " + str2; // Concatenation
        System.out.println("Concatenated String: " + str3);
        System.out.println("Length of str3: " + str3.length()); // Length of the string

        System.out.println("Enter your name: ");
        String myname = sc.nextLine(); // Read a string from the user
        
        System.out.println("My name is: " + myname); // Print the string

        for(char ch:myname.toCharArray()) { // Convert string to char array and iterate
            System.out.print(ch+" "); // Print each character
        }


    }
}