import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading dimensions of the 2D array
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        // Initializing the 2D array
        int[][] numbers = new int[rows][cols];

        // Filling the 2D array with user inputs
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}