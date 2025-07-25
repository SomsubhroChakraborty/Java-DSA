// Problem 1: Find All Pairs in an Array with Sum = K
// Problem Statement:
// Given an array of integers nums and an integer k, return all unique pairs of numbers that add up to k.
// Assume no duplicates in the array, and the order of pairs does not matter.
// Example:
// Input: nums = [1, 2, 3, 4, 5], k = 5
// Output: [[1, 4], [2, 3]]



package Array;

import java.util.*;

public class FindAllPairOfArray {

    public static List<List<Integer>> ArrayPair(int[] arr, int k){
       List<List<Integer>> result = new ArrayList<>();
       int left=0;
       int right= arr.length-1;
       Arrays.sort(arr);
      while(left<right){
        int sum = arr[left] +  arr[right];
        if(sum==k){
            result.add(Arrays.asList(arr[left],arr[right]));
            left++;
            right--;
            while (left < right && arr[left] == arr[left - 1]) left++;
            while (left < right && arr[right] == arr[right + 1]) right--;
        } 
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
      }
    
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6};
        int k=6;
       List result =  ArrayPair(arr, k);
       System.out.println(result);
    }
}
