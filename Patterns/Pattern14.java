//Palindromic pattern
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            } // 1ST HALF
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            } // 2ND HALF
              // HERE IF WE USE J=1, THEN A MIRROR PATTERN IS FORMED
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
