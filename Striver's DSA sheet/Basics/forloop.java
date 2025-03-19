// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1


// Provided 'n' you have to find out the n-th Fibonacci Number.
// Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

// "Indexing is start from 1"


// Example :
// Input: 6

// Output: 8


package Basics;

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
