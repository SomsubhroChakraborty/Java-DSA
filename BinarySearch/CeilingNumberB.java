package BinarySearch;
public class CeilingNumberB {
    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Exact match is the ceiling
            }
            if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // `left` now points to the ceiling (smallest number >= target)
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        int ceiling = binarysearch(arr, target);
        System.out.println("Ceiling number is: " + ceiling);
    }
}
