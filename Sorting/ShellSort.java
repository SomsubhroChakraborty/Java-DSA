package Sorting;
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        // Start with a large gap and reduce it
        for (int gap = n/2; gap > 0; gap /= 2) {
            // Perform insertion sort for elements at current gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                
                // Shift earlier gap-sorted elements up until
                // the correct location for temp is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                
                // Place temp in its correct location
                arr[j] = temp;
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Example usage
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        
        shellSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    
}
