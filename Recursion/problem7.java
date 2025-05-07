// check an array is sorted or not 
package Recursion;

public class problem7 {

    static boolean sorted(int[] arr , int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
public static void main(String[] args) {
    int[] arr = {1,2,4,3,5,6,7,8,9}; 
    System.out.println(sorted(arr, 0));
}    
}
