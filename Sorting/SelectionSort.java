package Sorting;

//
public class SelectionSort {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) { 
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

           
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {10, 80, 2, 5, 0, 6, 0, 1, 0, 3, 0, 3, 2};

        System.out.println("Original array:");
        printArray(a);

        selectionSort(a); 

        System.out.println("Sorted array:");
        printArray(a);
    }
}
