package Array;

import java.util.*;

public class FirstAndLastPositionOfArray {

    public static int[] positionOfArray(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) { // Fixed loop condition
            if (arr[i] == target) {
                if (first == -1) {
                    first = i; 
                }
                last = i; 
            }
        }
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] arr1 = {5, 7,8,9,7, 8,9, 8, 10};
        int target = 8;
        int[] result = positionOfArray(arr, target); // No need to create an instance
        int[] result1 = positionOfArray(arr1, target); // No need to create an instance
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
    }
}

