// Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
// calculator perform Addition, Subtraction, Division, Multiplication operation.
package Generics;

import java.util.function.BiFunction;

public class problem4 {
    public static BiFunction<Double, Double, Double> operation(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;          // Addition
            case "subtract" -> (a, b) -> a - b;     // Subtraction
            case "multiply" -> (a, b) -> a * b;     // Multiplication
            case "divide" -> (a, b) -> {
                if (b == 0) {
                    throw new ArithmeticException("not divisable");
                }
                else{
                   return a / b;
                }
            }; // Division
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
            
        };
    }
    public static void main(String[] args) {
        double a= 10.0;
        double b= 5.0;

        BiFunction<Double, Double, Double> add = operation("add");
        System.out.println("Addition " + add.apply(a,b));
        BiFunction<Double, Double, Double> subtract = operation("subtract");
        System.out.println("Subtraction " + subtract.apply(a,b));
        BiFunction<Double, Double, Double> multiply = operation("multiply");
        System.out.println("Multiplication " + multiply.apply(a,b));
        BiFunction<Double, Double, Double> divide = operation("divide");
        System.out.println("divition " + divide.apply(a,b));
    }
}
