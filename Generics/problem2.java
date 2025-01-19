// Write a generic method that computes the Second minimum and Second maximum elements of an array
// of type T and returns a pair containing the minimum and maximum value.


package Generics;

import java.util.Arrays;

public class problem2 {
   public static <T extends Comparable <T>> void sort(T[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0 ; j<arr.length-1-i;j++){
            if(arr[j].compareTo(arr[j+1])>0){
                T temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }

   public static void main(String[] args) {
    Integer[] array = {4,2,8,45,9,5};
    sort(array);
    System.out.println("The sorted array is : " + Arrays.toString(array));
    
    System.out.println("Second Min is : " + array[1]);
    System.out.println("Second Max is : " + array[array.length-2]);
   }
}
