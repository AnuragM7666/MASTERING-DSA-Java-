public class factorial {
    public int fact(int n) {
        if (n == 0)
            return 1;

        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        System.out.println(f.fact(5)); 
    }
}
