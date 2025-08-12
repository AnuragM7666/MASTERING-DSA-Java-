//it finds the missing number in an array of integers from 1 to n
public class missing {
    int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expSum = n * (n + 1) / 2;

        int actSum = 0;
        for (int num : arr) {
            actSum += num;
        }
        return expSum - actSum;
    }
    public static void main(String[] args) {
        missing obj = new missing();
        int[] arr = { 1, 2, 4, 5, 6 };
        int missingNumber = obj.findMissing(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
