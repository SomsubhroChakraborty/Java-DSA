public class ClosestElement {
    public static void main(String[] args) {
        int[] arr = {2,34,5,3,65,8,5,3};
        int target = 116;

        int closest = arr[0];
        int minDiff = arr[0]-target;
        if(minDiff<0){
            minDiff = -minDiff;
        }

        for(int i=0; i<=arr.length-1;i++){
           int currentDiff = arr[i] -target;
           if (currentDiff<0) {
            currentDiff =-currentDiff;
           }
           if(currentDiff < minDiff){
            closest = arr[i];
            minDiff = currentDiff;
           }
        }
        System.out.println("the closest one is : "+ closest);

    }
    
}
