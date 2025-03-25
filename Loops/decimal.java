//binary to decimal
public class decimal {
    public static int binary(int num){
        int ans=0;
        int power=1;

        while(num>0){
            int rem=num%10;
            num/=10;
            ans+=rem*power;
            power*=2;
        }return ans;
    }

    public static void main(String[] args) {
        int num=1010;
        System.out.println(binary(num));
    }
}
