package Recursion;

public class Problem6 {
    public static int search(int arr[],int start,int end ,int target)
    {
        if(start<end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid] == target)
            return mid;
            else if(arr[mid] > target)
            return search(arr,start,mid-1,target);
            else if(arr[mid]<target)
            return search(arr, mid+1, end, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 0, arr.length-1, 70));
    }
}