package Recursion;

import java.util.Scanner;

public class Problem4 {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        num = Math.abs(num);

        int result = sumOfDigits(num);
        System.out.println("Sum of digits: " + result);
    }
}