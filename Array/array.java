package Array;
//implementation of array
public class array {
    public static void main(String[] args) {
        // int[] numbers = { 1, 2, 3, 4, 5 }; // Initialize an array process 1
        int[] numbers = new int[4];// Initialize an array process 2
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println("Element at index 0:" + numbers[0]);
        System.out.println("Element at index 1:" + numbers[1]);
        System.out.println("Element at index 2:" + numbers[2]);
        System.out.println("Element at index 3:" + numbers[3]);

        // Sum of that elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements:" + sum);

        // Update an element in the array
        numbers[2] = 5;
        System.out.println("The 2nd element is:" + numbers[2]);

    }
}
