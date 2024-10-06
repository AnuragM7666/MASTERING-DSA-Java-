//Butterfly Pattern
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st left part of upper half
            for (int j = 1; j <= i; j++) {

                System.out.print(" *");
            } // spaces printing
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");

            } // right part of upper half
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // left part
            for (int j = 1; j <= i; j++) {

                System.out.print(" *");
            } // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            } // right part
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
