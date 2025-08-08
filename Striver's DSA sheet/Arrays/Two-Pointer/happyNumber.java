//this code checks if a number is a happy number
//A happy number is defined by the following process: Starting with any positive integer,
// replace the number by the sum of the squares of its digits, and
// repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1. 
//Those numbers for which this process ends in 1 are happy numbers.
public class happyNumber {
    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int num) {
        int slow = num;
        int fast = sumOfSquares(num);

        while (fast != 1 && slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        return fast == 1;

        // HashSet<Integer> seen = new HashSet<>();
        // while (num != 1) {
        //     if (seen.contains(num)) {
        //         return false;
        //     }
        //     seen.add(num);
        //     num = sumOfSquares(num);
        // }
        // return true;
    }

    public static void main(String[] args) {
        
        happyNumber hn = new happyNumber();
        int testNumber = 19;
        if (hn.isHappy(testNumber)) {
            System.out.println(testNumber + " is a happy number.");
        } else {
            System.out.println(testNumber + " is not a happy number.");
        }
    }
}
