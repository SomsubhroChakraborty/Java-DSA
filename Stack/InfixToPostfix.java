package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char symb : infix.toCharArray()) {
            // Step 3: If opening parenthesis, push to stack
            if (symb == '(') {
                stack.push(symb);
            } 
            // Step 4: If operand, append to output
            else if (Character.isLetterOrDigit(symb)) {
                postfix.append(symb);
            } 
            // Step 6: If closing parenthesis, pop until '(' is found
            else if (symb == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from stack
            } 
            // Step 5: If operator, handle precedence and associativity
            else {
                while (!stack.isEmpty() && precedence(symb) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(symb);
            }
        }

        // Step 7: Pop remaining operators from stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to define precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3; // Exponentiation (right associative)
            default: return -1;
        }
    }

    public static void main(String[] args) {
        String infix = "A+B*(C^D-E)"; // Expected output: ABCD^E-*+
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}
