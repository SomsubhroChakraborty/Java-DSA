// A ceiling number is the number which is greater than or equalto the target number

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        for(int i=0;i<=arr.length;i++){
            if(arr[i]>=target){
                System.out.println("The ceiling number is:"+ arr[i]);
                break;
            }
            // System.out.println("There is no ceiling number for this number :");
        }
    }
}
