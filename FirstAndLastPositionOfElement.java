import java.util.*;
public class FirstAndLastPositionOfElement {

    public static int binarysearch(int[]arr,int target){
        int left=0;
        int right = arr.length-1;
        
        int mid=left+(right-left)/2;
        while(left<=right){
            
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    } 
     public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int result = binarysearch(arr, target);
        int result2 = result+1;

        if (result != -1) {
            System.out.println("Element found at index: " + result);
            System.out.println("Element found at index: " + result2);
        } else {
            System.out.println("Element not found in the array.");
        }

     }
}
