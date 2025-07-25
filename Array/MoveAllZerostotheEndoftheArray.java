// Problem Statement:
// Given an integer array nums, move all 0s to the end while maintaining the relative order of non-zero elements. 
//Do this in-place without making a copy of the array.
// Example:
// Input: nums = [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]

package Array;

import java.util.Arrays;

public class MoveAllZerostotheEndoftheArray {
    public static int[] Modifiedarray(int[] arr){
        int num = arr.length;
        int pos = 0;
        for(int i=0 ; i<=num-1 ; i++){
        if(arr[i]!=0){
           arr[pos++]= arr[i];
            }
        }
        while(pos<num){
            arr[pos++]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0};
        int[]result=Modifiedarray(nums);
        System.out.println(Arrays.toString(result));
    }
}
