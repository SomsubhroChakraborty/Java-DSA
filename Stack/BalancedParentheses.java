package Stack;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char input : expression.toCharArray()) {
        
            if (input == '(' || input == '{' || input == '[') {
                stack.push(input);
            }
          
            else if (input == ')' || input == '}' || input == ']') {
             
                if (stack.isEmpty()) {
                    return false;
                }
                char popped = stack.pop(); 
               
                if (!isMatchingPair(popped, input)) {
                    return false;
                }
            }
        }

      
        return stack.isEmpty();
    }

    // Helper function to check if the brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    // Main method to test the function
    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}"; 
        String expression3 = "({[()]})"; 
        String expression4 = "{[("; 
        System.out.println(expression1 + " is " + (isValidExpression(expression1) ? "Valid" : "Invalid"));
        System.out.println(expression2 + " is " + (isValidExpression(expression2) ? "Valid" : "Invalid"));
        System.out.println(expression3 + " is " + (isValidExpression(expression3) ? "Valid" : "Invalid"));
        System.out.println(expression4 + " is " + (isValidExpression(expression4) ? "Valid" : "Invalid"));
    }
}
