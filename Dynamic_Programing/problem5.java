// Given an integer array nums, return true if you can partition the array into two subsets
// such that the sum of the elements in both subsets is equal or false otherwise.
// Example 1:
// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].

package Dynamic_Programing;

public class problem5 {
    public static boolean partition(int[] nums){
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target= total/2;
        if(total%2!=0){
            return false;
        }
        boolean[] dp = new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                dp[j]= dp[j]||dp[j-num];
            }
        }
return dp[target];
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,1};
       System.out.println( partition(arr));
    }
}
