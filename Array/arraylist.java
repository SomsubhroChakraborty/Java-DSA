package Array;
import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        // creating arraylist to store data
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Access and print elements from the ArrayList
        System.out.println("Element at index 0:" + numbers.get(0));
        System.out.println("Element at index 2:" + numbers.get(2));
        System.out.println("Element at index 4:" + numbers.get(4));

        // Calculate and print the sum of all elements in the ArrayList
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements:" + sum);

        // Update an element in the ArrayList
        numbers.set(4, 35);
        System.out.println("Updated element at index 4:" + numbers.get(4));

        // Iterate through the ArrayList using a for-each loop and print the elements
        System.out.println("Elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
