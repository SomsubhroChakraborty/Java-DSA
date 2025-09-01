package Array;
import java.util.*;
public class KthLargestElement {
    public static int ElementFound(int[] arr , int k){
        Arrays.sort(arr);
        int n = arr.length;

        // Return the kth largest element
        return arr[n - k];

    }
    public static void main(String[] args) {
        int[] arr = {2,56,3,76,9,54};
        int k = 3;
        int result = ElementFound(arr,k);
        System.out.println(result);
    }
}
