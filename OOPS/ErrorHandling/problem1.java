// 1. Basic Arithmetic Exception Handling
// Write a program that:
// Accepts two numbers as input.
// Divides the first number by the second.
// Handles the ArithmeticException if the second number is zero and displays an appropriate error message.


package OOPS.ErrorHandling;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the first number");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the second number");
            int num2 = Integer.parseInt(sc.nextLine());

            int result = num1/num2;
            System.out.println("result : "+ result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
