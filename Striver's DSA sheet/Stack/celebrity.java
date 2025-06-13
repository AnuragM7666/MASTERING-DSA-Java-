//A celebrity is a person who is known to all but does not know anyone at a party.
// A party is being organized by some people. 
//A square matrix mat[][] (n*n) is used to represent people at the party such that 
//if an element of row i and column j is set to 1 it means ith person knows jth person. 
//You need to return the index of the celebrity in the party,
// if the celebrity does not exist, return -1.
import java.util.Stack;

public class celebrity {
    public int findTheCeleb(int mat[][]) {
        int n = mat.length;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() > 1) {
            int i = s.pop(); //i
            int j = s.pop(); //j

            if (mat[i][j] == 0) {
                s.push(i);
            } else {
                s.push(j);
            }
        }

        int celeb = s.peek();

        for (int i = 0; i < n; i++) {
            if (i != celeb && (mat[celeb][i] == 1 || mat[i][celeb] == 0)) {
                return -1;
            }
        }
        return celeb;
    }
    public static void main(String[] args) {
        celebrity celebFinder = new celebrity();
        int[][] mat = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 1, 0}
        };
        int result = celebFinder.findTheCeleb(mat);
        if (result != -1) {
            System.out.println("The celebrity is person " + result);
        } else {
            System.out.println("There is no celebrity.");
        }
    }
}
