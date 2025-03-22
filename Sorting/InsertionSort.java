package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) { 
            int v = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > v) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = v;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 2, 5, 0, 6, 0, 1, 0, 3, 0, 3, 2};

        System.out.println("Insertion sort Original array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println(" Insertion sort Sorted array:");
        printArray(arr);
    }
}
