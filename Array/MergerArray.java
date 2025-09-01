package Array;

import java.util.*;

public class MergerArray {
    public static int[] mergerArray( int[] arr1 ,int[] arr2){
       int n= arr1.length;
       int m= arr2.length;
        int[] merged = new int[n+m];

        for(int i=0 ; i<n ;i++){
            merged[i] = arr1[i];
        }

        for(int j=0 ; j<m ;j++){
            merged[n+j] = arr2[j];
        }
        Arrays.sort(merged);

        return merged;
    }

    public static void main(String[] args) {
        int[] a= {1,3,2,6,4};
        int[] b= {0,7,5,9,8};
        int[] result = mergerArray(a,b);
        System.out.println(Arrays.toString(result));
    }
}
