public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {  // Fix loop condition
            int mid = left + (right - left) / 2;

            // If the right neighbor is greater, move to the right
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];  // Return the peak element value
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
        int[] arr3 = {1, 3, 7,6,6,6,6,4,3,2,1};

        System.out.println("Peak element in arr1: " + findPeakElement(arr1));
        System.out.println("Peak element in arr2: " + findPeakElement(arr2));
        System.out.println("Peak element in arr3: " + findPeakElement(arr3));
    }
}
