 public class MInInRotatedSortedArray {
    
    public static int mininrotatedarray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the minimum element must be in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // If mid element is less than or equal to the rightmost element,
                // the minimum element is at mid or in the left half
                right = mid;
            }
        }

        // When the loop ends, left will be pointing to the minimum element
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Minimum element: " + mininrotatedarray(arr));  // Output: 1
    }
}
