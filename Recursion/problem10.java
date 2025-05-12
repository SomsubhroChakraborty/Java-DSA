// Write a program to finding a maximum-length subsequence of a given string that is also
// a Palindrome. Given a string ‘S’, find the length of the Longest Palindromic
// Subsequence in it.
// For example, Input: S =“BBABCBCAB” Output: 7 Explanation: As “BABCBAB”
// is the longest palindromic subsequence in it. “BBBBB” and “BBCBB” are also
// palindromic subsequences of the given sequence, but not the longest ones.

package Recursion;
public class problem10 {
    static int longPalSubseq(String s){
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            dp[i][i]=1;
        }
        for (int len=2; len<=n ;len++){
            for(int i = 0;i<=n-len;i++){
                int j = i+ len-1;

                if(s.charAt(i) == s.charAt(j)){
                    if(len==2)
                        dp[i][j] =2;
                    else   
                    dp[i][j] =dp[i+1][j-1]+2;  
                }else{
                    dp[i][j] =Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }  
        return dp[0][n-1];  
        }
    
public static void main(String[] args) {
     String s = "BBABCBCAB";
        int result = longPalSubseq(s);
        System.out.println("Length of Longest Palindromic Subsequence: " + result);
}
}
