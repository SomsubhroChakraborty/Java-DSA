public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};
        int start=2;
        int end= 7;
        int target = 100;

boolean flag =false;
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                System.out.println("The value is at index :" + i);
                 flag =true;
                break;
            }
        }
        if(!flag){
            System.out.println("The value is not in range !");
        }
        
    }
}
