public class FloorOfANumber {

    public static int linearsearch(int[] arr, int target){
        
        for(int i=0; i<=arr.length;i++){
            if(arr[i]>=target){
                System.out.println("flooor of the number is : "+ arr[i-1]);
                break;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target= 15;
        linearsearch(arr, target);

    }
}
