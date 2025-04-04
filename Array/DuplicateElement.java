package Array;

import java.util.HashSet;

public class DuplicateElement {
    public static void printDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) { // If num is already in the set, it's a duplicate
                duplicates.add(num);
            }
        }

        // Print duplicates if found, otherwise print "No duplicates found"
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 4, 5, 7, 6, 8, 7, 8, 8};
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        printDuplicates(arr);
        printDuplicates(arr1);
    }
    }
