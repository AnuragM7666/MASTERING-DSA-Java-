//While loop is another loop like for loop but unlike for loop it only checks for one condition.
//Here, we will use a while loop and print a number n's table in reverse order.
public class reverseTable {
    public void rT(int n){
        int first=n*10;
        while(first>0){
            System.out.println(first+" ");
            first-=n;
        }
    }
}
