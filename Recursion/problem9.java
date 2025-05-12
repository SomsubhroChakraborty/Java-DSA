// Input: coins[] = [25, 10, 5], sum = 30
// Output: 2
// Explanation : Minimum 2 coins needed, 25 and 5  


package Recursion;
public class problem9 {
    
    static int min_coin(int[] a, int i, int out){
        // Base case
        if(out == 0) return 0;
        if(out < 0 || i == a.length) return Integer.MAX_VALUE;

        int take = Integer.MAX_VALUE;

        if(a[i] > 0){
            take = min_coin(a, i, out - a[i]);
            if(take != Integer.MAX_VALUE) take++;
        }

        int notake = min_coin(a, i + 1, out); 

        return Math.min(take, notake);
    }

    static int minCoin(int[] a, int out){
        int ans = min_coin(a, 0, out);
        return ans != Integer.MAX_VALUE ? ans : -1;
    }

    public static void main(String[] args) {
        int[] coins = {25, 10, 5};  
        int sum = 30;
        System.out.println(minCoin(coins, sum)); 
    }
}

