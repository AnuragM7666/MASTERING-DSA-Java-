// in this question we are given a sorted array and a target sum.
// We need to find the indices of the two numbers that add up to the target sum.
public class twoSum2 {
    public int[] solution(int[] arr, int tar) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] < tar) {
                i++;
            } else if (arr[i] + arr[j] > tar) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        twoSum2 obj = new twoSum2();
        int[] arr = { 1, 2, 3, 4, 6 };
        int target = 6;
        int[] result = obj.solution(arr, target);
        
        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        }
    }
}
