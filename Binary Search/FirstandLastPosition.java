public class FirstandLastPosition {
    // Method to find the first and last position of the target
    public static int findPosition(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1;
        int position = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                position = mid; // Update position
                // Narrow down the search space
                if (findFirst) {
                    right = mid - 1; // Search left for the first occurrence
                } else {
                    left = mid + 1;  // Search right for the last occurrence
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int firstPosition = findPosition(arr, target, true);  // Find first occurrence
        int lastPosition = findPosition(arr, target, false);  // Find last occurrence

        if (firstPosition != -1) {
            System.out.println("First occurrence of element at index: " + firstPosition);
            System.out.println("Last occurrence of element at index: " + lastPosition);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
