








// 2. Coin Change (Minimum Number of Coins)
// Given coins of different denominations and a total amount, find the fewest coins needed.
// Input: coins = [1,2,5], amount = 11
// Output: 3 (5 + 5 + 1)

package Dynamic_Programing;

import java.lang.reflect.Array;
import java.util.Arrays;
public class problem2 {
   public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Fill with a big number
        dp[0] = 0; // Base case: 0 coins to make amount 0
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int[] S = {1,5,6,9};
        int N = 10;
        System.out.println(coinChange(coins, amount));  // Output: 3
        System.out.println(coinChange(S, N));  
    }
}
