// Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. 
// If the target is found in the array, return its index. If the target is not found, return -1.
// Examples:
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: The target integer 9 exists in nums and its index is 4
package BinarySearch;
public class SearchXInsortedarray 
{
public static int search(int[] arr, int k){
    int left =0;
    int right = arr.length;

    while(left<=right){
        int mid = left +(right-left)/2;

        if(arr[mid]==k){
            return mid ;
        }
        if(arr[mid]<k){
            left=mid+1;
        }
        else{
            right= mid-1;
        }
    }
    return -1;
} 
public static void main(String[] args) {
    int[] nums = {-1,0,3,5,9,12};
    int target = 9;
    int result = search(nums, target);
    System.out.println(result);
}
}