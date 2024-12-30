// 2. Multiple Exception Handling
// Create a program that:
// Reads an integer from the user.
// Handles NumberFormatException if the user enters a non-integer value.
// Handles InputMismatchException for invalid input format.
// Handles ArithmeticException for division by zero.

package OOPS.ErrorHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println("Enter the numerator : ");
            int numerator = sc.nextInt();
            System.out.println("Enter the denumerator : ");
            int denumerator = sc.nextInt();

            int result = numerator/denumerator;
            System.out.println("Result : "+ result);

        } catch (ArithmeticException e) {
            System.out.println("there is a arithmetic exception");
        }
        catch(InputMismatchException e){
            System.out.println("there is a input mismatch exception");
        }
        catch(NumberFormatException e){
            System.out.println("there is a NUmber format exception");
        }
        finally{
            System.out.println("Program execution complete");
            sc.close();
        }
    }
}
