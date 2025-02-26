package Sorting;

public class OptimizedBubbleSort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        int swap = 1;
        for (int i = 0; i <= n - 1 && swap == 1; i++) {
            swap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = 0;
                }
            }
        }
    }

    public static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 10, 80, 2, 5, 0, 6, 0, 1, 0, 3, 0, 3, 2 };

        System.out.println("Original array:");
        printArray(a);

        bubbleSort(a);

        System.out.println("Sorted array:");
        printArray(a);
    }
}
