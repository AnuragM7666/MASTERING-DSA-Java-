public class digit {
    public static int digits(int n){
        while(n!=0){
            int dig=n%10;
            System.out.println(dig);
            n/=10;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n=7894;
        System.out.println(digits(n));
    }
}
