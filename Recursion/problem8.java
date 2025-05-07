package Recursion;

public class problem8 {
    
    static boolean find(int[]arr, int target, int index){
        //base condition
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int[]arr, int target, int index){
        //base condition
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        } 
        else{
            return findIndex(arr, target, index +1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,7,56,4,6,4,6,443};
       
        System.out.println(find(arr, 0, 0));
        System.out.println(findIndex(arr, 0, 0));
    }
    
}
