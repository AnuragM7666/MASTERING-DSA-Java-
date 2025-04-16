public class basic {
    public void printNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.print(n+ " ");
        printNum(n - 1);
    }
    public static void main(String[] args) {
        basic b = new basic();
        b.printNum(5);
    }
}