
package Array;
public class LargestContiguousSum {
    public static int contiguoussum(int[] arr ){
        int size = arr.length;
        int currsum = arr[0];
        int maxsum =arr[0];
        for(int i=1; i<size ; i++){
            currsum = Math.max(arr[i],currsum+arr[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int number = contiguoussum(nums);
        System.out.println(number);
    }
}
