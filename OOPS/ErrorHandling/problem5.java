// Write a program called Factorial.java that computes factorials and catches the result in an
// array of type long for reuse. The long type of variable has its own range. For example 20!
// Is as high as the range of long type. So check the argument passes and “throw an
// exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
// Exception with a message “Value of x must be positive”.If x is above the length of the
// array throw an IllegalArgumentException with a message “Result will overflow”.
// Here x is the value for which we want to find the factorial.
package OOPS.ErrorHandling;

import java.util.Scanner;

public class problem5 {
    public static long factorialCalculation(int number){
        long factorial =1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
    public static void main(String[] args) {
        long[] StoreArray = new long[21];

        for(int i=0; i<=20 ; i++){
            StoreArray[i] = factorialCalculation(i);
        }
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter a number between 0 to 20 and find its factorial");
               int input = scanner.nextInt();
               long result =  StoreArray[input] ;
               System.out.println(result);

                if(input<0 || input>20){
                    throw new ArithmeticException("Input a number between 0 to 20");
                }
            }catch(ArithmeticException e){
                System.out.println("Enter a valid input");
            }
            finally{
                scanner.close();
                System.out.println("The code executed successfully");
            }
        }
    }
}
