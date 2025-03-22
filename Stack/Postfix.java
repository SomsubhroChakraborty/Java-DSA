package Stack;

import java.util.Stack;

public class Postfix {
    
    static class PostfixEvaluate {
        public static int evaluatePostfix(String expression) {
            Stack<Integer> operandStack = new Stack<>();
            for (char input : expression.toCharArray()) {
                if (Character.isDigit(input)) {
                    operandStack.push(input - '0'); // Convert char to int
                } else {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    int val = applyOperator(input, operand1, operand2);
                    operandStack.push(val);
                }
            }
            return operandStack.pop();
        } 

        private static int applyOperator(char operator, int operand1, int operand2) {
            switch (operator) {
                case '+': return operand1 + operand2;
                case '-': return operand1 - operand2;
                case '*': return operand1 * operand2;
                case '/': return operand1 / operand2;
                default: throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
    }

    public static void main(String[] args) {
        String postfixExpression = "23*54*+"; // Equivalent to (2*3) + (5*4) = 6 + 20 = 26
        System.out.println("Result: " + PostfixEvaluate.evaluatePostfix(postfixExpression));
    }
}