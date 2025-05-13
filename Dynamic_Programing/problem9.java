// Write a program to find out the total number of ways to make change of given amount.
// For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1}, {1,1,2}, {2,2}, {1,3}.
// So output should be 4. [Infinite Supply of coins]

package Dynamic_Programing;

public class problem9 {
    public static int combination(int[] S , int N){
        int[]dp = new int[N+1];
        dp[0]=1;

        for(int i:S){
            for(int j=i;j<=N;j++){
                dp[j]+=dp[j-i];
            }
        }
        return dp[N];
    }
    public static void main(String[] args) {
        int[] S = {1,2,3};
        int N=4;
        System.out.println(combination(S, N));
    }
}
