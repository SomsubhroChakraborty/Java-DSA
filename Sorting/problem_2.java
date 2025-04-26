// For simplicity, keeping the main class and file name the same
public class problem_2 {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Print array after partitioning
            System.out.print("Partitioned array (Pivot index " + pi + "): ");
            printArray(arr);

            // Recursively sort the subarrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function for Quick Sort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Swap the pivot element into place
        swap(arr, i + 1, high);

        return i + 1;  // Return the pivot index
    }

    // Helper method for swapping elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Merge Sort with iteration output
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Prevents overflow for large arrays

            // Recursively sort the left and right subarrays
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted subarrays
            merge(arr, left, mid, right);

            // Print array after merging
            System.out.print("Merged array (from index " + left + " to " + right + "): ");
            printArray(arr);
        }
    }

    // Merge function for Merge Sort
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr[left...right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] originalArr = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        printArray(originalArr);
        System.out.println();
    
        // Quick Sort
        int[] quickSortArr = originalArr.clone();
        System.out.println("Quick Sort:");
        quickSort(quickSortArr, 0, quickSortArr.length - 1);
    
        // Merge Sort (use a fresh clone)
        int[] mergeSortArr = originalArr.clone();
        System.out.println("\nMerge Sort:");
        mergeSort(mergeSortArr, 0, mergeSortArr.length - 1);
    
        // Final sorted arrays
        System.out.println("\nFinal sorted array from Quick Sort:");
        Sort.printArray(quickSortArr);
        System.out.println("Final sorted array from Merge Sort:");
        Sort.printArray(mergeSortArr);
    }
}