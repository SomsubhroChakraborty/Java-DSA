package Stack;

import java.util.Stack;

public class Prefix {
    static class EvaluatePrefix {
        public static int PrefixEvaluator(String expression) {
            Stack<Integer> operandStack = new Stack<>();

            // Iterate from right to left (since it's prefix notation)
            for (int i = expression.length() - 1; i >= 0; i--) {
                char input = expression.charAt(i);

                // If it's a digit, push it onto the stack
                if (Character.isDigit(input)) {
                    operandStack.push(input - '0');                
                } else {
                    // It's an operator; pop two operands from the stack
                    int operand1 = operandStack.pop();
                    int operand2 = operandStack.pop();
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
        String prefixExpression = "-9/+*3484";
        System.out.println("Prefix Evaluation Result: " + EvaluatePrefix.PrefixEvaluator(prefixExpression));
    }
}
