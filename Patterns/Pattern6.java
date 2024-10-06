// other half of  pyramid
public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
                // watch out for pattern 5 , there is difference of only one space between them
            }
            // inner loop for star print
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
