public class digitalRootOrAddDigits {
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);

        // Alternatively, you can use the digital root formula:
        // if (num == 0)
        // return 0;
        // if (num % 9 == 0)
        //     return 9;
        // return num % 9;

    }
    public static void main(String[] args) {
        int num = 38; // Example input
        System.out.println("The digital root of " + num + " is: " + addDigits(num));
    }
}
