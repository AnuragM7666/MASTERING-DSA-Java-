public class romanToInteger {
    private int value(char c) {
        switch (c) { //we can use hashmap, but switch is more efficient for a small set of characters
            case 'I': 
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return 0;
        }
    }

    public int calc(String s) {
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));

            if (curr >= prev) {
                total += curr;
            } else {
                total -= curr;
            }
            prev = curr;
        }
        return total;
    }
    public static void main(String[] args) {
        romanToInteger rti = new romanToInteger();
        System.out.println(rti.calc("III")); 
        System.out.println(rti.calc("IV")); 
        System.out.println(rti.calc("IX")); 
        System.out.println(rti.calc("LVIII"));
        System.out.println(rti.calc("MCMXCIV")); 
    }
}
