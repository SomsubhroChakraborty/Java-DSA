package Sorting;

import java.util.Arrays;

public class problem_3{
    // Radix Sort implementation
    public static void radixSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        
        // Find the maximum number to know number of digits
        int max = getMax(arr);
        
        // Do counting sort for every digit
        // instead of passing digit number, pass exponent
        // exp is 10^i where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
            System.out.println("After sorting on " + (exp == 1 ? "ones" : 
                               exp == 10 ? "tens" : 
                               exp == 100 ? "hundreds" : 
                               exp == 1000 ? "thousands" : "digit " + (int)Math.log10(exp)) 
                               + " place: " + Arrays.toString(arr));
        }
    }
    
    // A utility function to get maximum value in arr[]
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // count array for digits 0-9
        
        // Initialize count array
        Arrays.fill(count, 0);
        
        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        
        // Copy the output array to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    // Heap Sort implementation
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        System.out.println("After building max heap: " + Arrays.toString(arr));
        
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
            
            System.out.println("After extracting max element: " + Arrays.toString(arr));
        }
    }
    
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2
        
        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    
    // Main method to test the sorting algorithms
    public static void main(String[] args) {
        // Test arrays
        int[] arrForRadix = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] arrForHeap = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Original array for Radix Sort: " + Arrays.toString(arrForRadix));
        System.out.println("Running Radix Sort...");
        radixSort(arrForRadix);
        System.out.println("Final sorted array using Radix Sort: " + Arrays.toString(arrForRadix));
        
        System.out.println("\nOriginal array for Heap Sort: " + Arrays.toString(arrForHeap));
        System.out.println("Running Heap Sort...");
        heapSort(arrForHeap);
        System.out.println("Final sorted array using Heap Sort: " + Arrays.toString(arrForHeap));
    }
}
