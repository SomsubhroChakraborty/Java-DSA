package Array;

public class SearchRotatedSortedArray {
    public static int SearchArray(int[] arr, int target ){
        int n = arr.length;
        int position = 0;
		for(int i=0 ; i<n;i++){
			if(arr[i] == target){
				position = i;
				return position;
			}
		}
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 6;
        System.out.println(SearchArray(arr, target));
    }
}
