// Write a Generic Method that can perform the sorting of any type of data.

package Generics;

import java.util.Arrays;


public class problem1 {
    public static <T extends Comparable <T>> void sort(T[] arr){ //comparable is a class where compareTo belongs
        for(int i=0; i<=arr.length-1;i++){
            for(int j=0;j<arr.length-j-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){ //compareTO use for sorting
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {2,5,23,1,5,8};
        System.out.println("Before sorting : " + Arrays.toString(array));
        sort(array);
        System.out.println("After sorting : " + Arrays.toString(array));

    }
}
