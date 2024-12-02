public class BinarySearch{

public static int binarysearch(int[] arr , int target){
    int left =0;
    int right =arr.length-1;

    while(left<=right){
        int mid = left + (right-left)/2;

        if(arr[mid]==target){
            // System.out.println("the target at position : " + arr[mid]);
            return mid;
        }
         if(arr[mid]<target){
            left = mid+1;
         }
         else{
            right =mid-1;
         }
    }

    return -1;
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,9};
        int target = 8;

        int result = binarysearch(arr, target);


        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}