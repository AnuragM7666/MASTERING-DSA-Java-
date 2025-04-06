public class armstrong {
    public static boolean isArm(int n){
        int N=n;
        int sumOfCubes=0;
        while(n!=0) {
            int dig = n % 10;
            sumOfCubes += (dig * dig * dig);
            n /= 10;
        }
        return sumOfCubes==N;
    }

    public static void main(String[] args) {
        int n=153;
        System.out.println(isArm(n));
    }
}
