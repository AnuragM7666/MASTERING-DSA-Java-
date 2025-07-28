    //return pair of elements whose sum is equal to target in a sorted array
    import java.util.Arrays;
    import java.util.Vector;
    public class PairSum {
        public static int[] SubSum(int[] arr, int target) {
            Vector<Integer> Pair = new Vector<Integer>();

            int i = 0;
            int j = arr.length - 1;
            int sum = 0;
            while (i < j) {
                sum = arr[i] + arr[j];
                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else {
                    Pair.add(arr[i]);
                    Pair.add(arr[j]);
                    return new int[] { arr[i], arr[j] };
                }
            }
            return new int[] {};

        }

        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 6 };
            int target = 6;
            int[] result = SubSum(arr, target);
            System.out.println(Arrays.toString(result));
        }
    }