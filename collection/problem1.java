// Write a program to find whether an array is subset of another array or not.
package collection;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Integer[] arrayA = {1, 2, 3, 45, 56};
        Integer[] arrayB = {1, 2, 3,6};

        Set<Integer> setA = new HashSet<>(Arrays.asList(arrayA));
        Set<Integer> setB = new HashSet<>(Arrays.asList(arrayB));

        // Check if setA contains all elements of setB
        if (setA.containsAll(setB)) {
            System.out.println("Set B is a subset of Set A.");
        } else {
            System.out.println("Set B is not a subset of Set A.");
        }
    }
}

