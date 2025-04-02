package Array;

import java.util.Arrays;

public class HighestElementOfArray {
    public static int largestelement(int []arr){
        Arrays.sort(arr);
        return arr[arr.length -1];
    } 
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,2,1,5,3};
        int highest = largestelement(arr);
        System.out.println("Highest Element is : "+ highest);
    }

}
