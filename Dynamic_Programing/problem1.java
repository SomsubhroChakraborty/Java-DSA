// 1. Best Time to Buy and Sell Stock II (Unlimited Transactions)
// You can buy and sell multiple times. No fee.
// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Reason: Buy at 1, sell at 5 (profit 4), buy at 3, sell at 6 (profit 3)

package Dynamic_Programing;

public class problem1 {
    public static int maxprofit(int[] prices){
        if(prices.length == 0) return 0;

        int n= prices.length;
        int cash = 0;

        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                cash += prices[i]-prices[i+1];
            }
        }
        return cash;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxprofit(prices));
    }
}
