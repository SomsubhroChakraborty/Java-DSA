public class CountOccurrences{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,4,2,2,5};
        int count =0;
        int target =2;

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] == target){
                count +=1;
            }
        }
        System.out.println("The total Occerrences is : " + count);
    }
}