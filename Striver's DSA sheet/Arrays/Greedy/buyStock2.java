package Greedy;
//Given an array arr[] denoting the cost of stock on each day, the task is to find 
//the maximum total profit if we can buy and sell the stocks any number of times.
//Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
public class buyStock2 {
    public int profit(int[] prices) {
        int Totalprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                Totalprofit += prices[i] - prices[i - 1];
            }
        }
        return Totalprofit;
    }

    public static void main(String[] args) {
        buyStock2 stock = new buyStock2();
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int result = stock.profit(prices);
        System.out.println(result); 
    }
}
