package String;
import java.util.*;
public class NextGreaterElement {
    public static int[] NextGreaterElement(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0 ; i<n;i++){
            result[i]=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    result[i]=arr[j];
                break;
                    }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 3, 5};
        int[] res = NextGreaterElement(a);
        System.out.println(java.util.Arrays.toString(res));
    }
}
