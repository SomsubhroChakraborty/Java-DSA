package Sorting;

class Sort {
    // Selection Sort
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  
            int min_idx = i;

            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
          
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            
            
            System.out.print("After iteration " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // Insertion Sort
    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Print array after each iteration
            System.out.print("After iteration " + i + ": ");
            printArray(arr);
        }
    }

    // Print the array
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class problem_1 {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };

        // Use the correct selection sort method
        System.out.println("Selection Sort:");
        Sort.SelectionSort(arr);

        // Reset array to original for Insertion Sort
        int arr2[] = { 12, 11, 13, 5, 6 };
        System.out.println("\nInsertion Sort:");
        Sort.InsertionSort(arr2);

        // Final sorted arrays
        System.out.println("\nFinal sorted array from Selection Sort:");
        Sort.printArray(arr);
        System.out.println("Final sorted array from Insertion Sort:");
        Sort.printArray(arr2);
    }
}