import java.util.*;
public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter your number:");
            int n = sc.nextInt();
            if(n%10==0){
                break; // we can use continue keyword here as well
            }System.out.println("your number was"+n);

        } while (true);
    }
}
