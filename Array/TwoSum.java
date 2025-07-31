package Array;

import java.util.Arrays;

public class TwoSum {
    public static int[] twosum(int[] arr , int target){
        int n= arr.length;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums ={ 1,2,3,4,5};
        int target= 9;
        int [] result= twosum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
