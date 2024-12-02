public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if (( arr[mid - 1] <= arr[mid]) && ( arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }
            // If the left neighbor is greater, move to the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // Otherwise, move to the right half
            else {
                left = mid + 1;
            }
        }
        return -1; 








        
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};

        System.out.println("Peak element in arr1: " + findPeakElement(arr1));
        System.out.println("Peak element in arr2: " + findPeakElement(arr2));
    }
}
