// You are given an array prices where prices[i] is the price of a given stock on the ith day,
// and an integer fee representing a transaction fee.
// Find the maximum profit you can achieve. You may complete as many transactions as
// you like, but you need to pay the transaction fee for each transaction.
// Note: you must sell the stock before you buy again. The transaction fee is only charged
// once for each stock purchase and sale.
// Example 1:
// Input: prices = [1, 3, 2, 8, 4, 9], fee = 2
// Output: 8
// Explanation: The maximum profit can be achieved by:
// - Buying at prices [0] = 1
// - Selling at prices [3] = 8
// - Buying at prices [4] = 4
// - Selling at prices [5] = 9
// The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
// Example 2:
// Input: prices = [1, 3, 7, 5, 10, 3], fee = 3
// Output: 6
package Recursion;

public class problem12 {
    public static int MaxProfit(int[]prices, int fee){
        //base case
        if(prices.length == 0) return 0;

        int n= prices.length;
        int cash =0;
        int hold = -prices[0];

        for(int i=0; i<n; i++){
            cash = Math.max(cash,hold+prices[i]-fee);
            hold = Math.max(hold,cash-prices[i]); 
        }
        return cash;
    }
    public static void main(String[] args) {
        int[] prices= {1, 3, 2, 8, 4, 9};
        int fee=2;
        System.out.println(MaxProfit(prices,fee));
        int[] prices2= {1, 3, 7, 5, 10, 3};
        int fee2=3;
        System.out.println(MaxProfit(prices2,fee2));
    }
}
