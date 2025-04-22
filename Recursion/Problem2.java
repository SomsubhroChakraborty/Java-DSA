// Write a recursive function to print the first n Fibonacci numbers.
package Recursion;
public class Problem2
{
    public static int fibonacci(int n) {
    if (n <= 1)
        return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Function to print the first n Fibonacci numbers
public static void printFibonacci(int n) {
    for (int i = 0; i < n; i++) {
        System.out.print(fibonacci(i) + " ");
    }
}
    public static void main(String[] args) {
        int n = 10; 
        printFibonacci(n);
    }
}