//converting a binary number into decimal
public class binary {
    public static  int decimal(int num){
        int ans=0; int power=1;
        while(num>0){
            int rem=num%2;
            num/=2;
            ans+=(rem*power);
            power*=10;
        }return ans;
    }

    public static void main(String[] args) {
        int num=10;
        System.out.println(decimal(num));
    }
}
