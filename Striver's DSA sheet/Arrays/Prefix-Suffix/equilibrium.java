// This Java program finds the equilibrium point in an array.
// An equilibrium point is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
public class equilibrium {
    int equilibriumPoint(int[] arr) {
        int ls = 0, rs = 0, ts = 0;

        for (int num : arr) {
            ts += num;
        }
        for (int i = 0; i < arr.length; i++) {
            rs = ts - ls - arr[i];
            if (ls == rs) {
                return i;
            }

            ls += arr[i];
        }
        return -1; 
    }
    public static void main(String[] args) {
        equilibrium eq = new equilibrium();
        int[] arr = {1, 3, 5, 2, 2};
        int result = eq.equilibriumPoint(arr);
        if (result != -1) {
            System.out.println("Equilibrium point is at index: " + result);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }
}