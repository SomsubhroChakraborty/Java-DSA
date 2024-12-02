public class SmallestELement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int min= arr[0];
        for(int i=0 ; i<=arr.length-1;i++){
            for(int j=0 ;j<=arr.length-1;j++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        System.out.println("Smallest element is" + min);
    }
}
