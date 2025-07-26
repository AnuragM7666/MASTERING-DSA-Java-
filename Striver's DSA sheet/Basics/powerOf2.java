public class powerOf2 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public int[] powerOfTwo(int[] n) {
        int count = 0;
        for (int num : n) {
            if (isPowerOfTwo(num)) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int num : n) {
            if (isPowerOfTwo(num)) {
                result[index++] = num;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        powerOf2 p = new powerOf2();
        int[] numbers = {1, 2, 3, 4, 5, 8, 16, 18};
        int[] powersOfTwo = p.powerOfTwo(numbers);
        
        System.out.print("Powers of two in the array: ");
        for (int num : powersOfTwo) {
            System.out.print(num + " ");
        }
    }
}