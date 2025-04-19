// Problem: Given an array, find the length of the longest strictly increasing subsequence.
// Example: Input: [10,9,2,5,3,7,101,18] → Output: 4 (subsequence [2,3,7,101]).
// Concepts Tested: DP, binary search for O(n log n).
// Follow-up: Return the subsequence.
// explain this problem


package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem3 {
   public int[] lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {0}; // Return length 0 and empty subsequence
        }
        
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] = length of LIS ending at i
        int[] prev = new int[n]; // prev[i] = previous index in LIS
        Arrays.fill(dp, 1); // Each element is an LIS of length 1
        Arrays.fill(prev, -1); // Initialize with -1 (no predecessor)
        
        int maxLen = 1; // Track maximum LIS length
        int maxIndex = 0; // Track index where max LIS ends
        
        // Compute LIS lengths
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }
        
        // Reconstruct subsequence
        List<Integer> subsequence = new ArrayList<>();
        while (maxIndex != -1) {
            subsequence.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        Collections.reverse(subsequence); // Reverse to get correct order
        
        // Prepare result: [length, subsequence elements]
        int[] result = new int[subsequence.size() + 1];
        result[0] = maxLen;
        for (int i = 0; i < subsequence.size(); i++) {
            result[i + 1] = subsequence.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        problem3 sol = new problem3();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] result = sol.lengthOfLIS(nums);
        System.out.println("Length of LIS: " + result[0]);
        System.out.print("Subsequence: ");
        for (int i = 1; i < result.length; i++) {
        System.out.print(result[i] + " ");
        }
    }
}
