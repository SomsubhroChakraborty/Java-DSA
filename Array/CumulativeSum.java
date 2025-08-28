package Array;

import java.util.Arrays;

public class CumulativeSum {
    
    public static int[] CumulativeSum(int[] arr){
        int[] cumarr = new int[arr.length];
        int total = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            total = total+arr[i];
            cumarr[i]= total;
        }
        return cumarr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int []result =CumulativeSum(arr);

        System.out.println("Original array:" + Arrays.toString(arr));
        System.out.println("Cumulative array :"+Arrays.toString(result));
    }
}
