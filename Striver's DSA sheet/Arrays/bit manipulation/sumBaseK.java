//Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
//After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
public class sumBaseK {
    public int sum(int n,int k){
        //This line converts the integer n to its string representation in base k.
        String s=Integer.toString(n,k);

        int sum=0;
        // while(n>0){
        //     int rem=n%k;
        //     sum+=rem;
        //     n/=k;
        // }
        for(char c:s.toCharArray()){
            if(c >= '0' && c <= '9') {
                sum += c - '0';
            } else {
                sum += c - 'a' + 10; // for bases > 10
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        sumBaseK sol=new sumBaseK();
        System.out.println(sol.sum(10,2));

        System.out.println(sol.sum(34,6));
    }
}
