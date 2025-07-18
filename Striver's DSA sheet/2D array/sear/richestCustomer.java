//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the 
//i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. 
//The richest customer is the customer that has the maximum wealth.
public class richestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            int currentWealth = 0;
            for (int j = 0; j < n; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 5, 6 } };
        System.out.println(maximumWealth(accounts)); 
    }
}
