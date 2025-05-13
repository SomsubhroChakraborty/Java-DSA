// A production company has to ship items of various weights vi, 1 ≤ i ≤ n on a truck.
// There is a max weight X that the truck can take. Assume that there is an unlimited
// supply of each item. The company wants to understand how many different ways there
// are to pack the truck. There is no volume/size limit and the order the items go onto the
// truck does not matter. Write a program to find the number of ways using DP.
// For example, the set of weights might be {1, 3, 4, 7} and X = 10 then some of the
// possible ways to fill the truck are: {7, 3} {7, 1, 1, 1} {4, 4, 1, 1} {4, 3, 3} {4, 3, 1, 1,
// 1} {4, 1, 1, 1, 1, 1, 1} {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} etc



package Dynamic_Programing;

public class problem7 {
    public static int WaysToLoad(int[] weights,int X){
        int[] dp = new int[X+1];
        dp[0]=1;

        for(int w:weights){
            for(int j = w; j<=X;j++){
                dp[j]+=dp[j-w];
            }
        }
        return dp[X];
    }
    public static void main(String[] args) {
        int[] weights ={1, 3, 4, 7};
        int X=10;
        System.out.println(WaysToLoad(weights, X));
    }
}
