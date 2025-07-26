// Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). 
//In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on.
//If there are multiple solutions, find the lexicographically smallest one.
// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.
// Examples:
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.

package Array;

import java.util.Arrays;

public class WaveArray {
    public static int[] wavearray(int[] arr){
        Arrays.sort(arr);
       
        int num = arr.length;
        for(int i=0; i<=num-1 ;i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    } 
    public static void main(String[] args) {
        int[] num= {1,2,3,4,5,6};
        int[] result = wavearray(num);
        System.out.println(Arrays.toString(result));
    }
}
