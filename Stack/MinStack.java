// The Min Stack problem requires designing a stack that supports push, pop, top, and retrieving the minimum element in 
// constant time. To achieve this, an additional stack is used to keep track of the minimum elements. When an element is 
// pushed onto the main stack, if it is less than or equal to the current minimum, it is also pushed onto the minimum stack.
//  When an element is popped from the main stack, if it is the current minimum, it is also popped from the minimum stack. 
//  This ensures that the top of the minimum stack always holds the current minimum element of the main stack

package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> mn;
    public  MinStack(){
      st = new Stack<>();
      mn = new Stack<>();
    }

    public void push(int x){
        st.push(x);
        if(mn.empty()||x<=mn.peek()){
            mn.push(x);
        }
    }

    public void pop(){
        if(st.peek().equals(mn.peek())){
            mn.peek();        
        }
        if(st.empty()){
            throw new RuntimeException("Stack is empty");
        }
    }

    public int getMin(){
        if(mn.empty()){
            throw new RuntimeException("Stack is empty");
        }
        return mn.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);
        minStack.push(8);

        System.out.println("Minimum: " + minStack.getMin()); // Should print 2
        minStack.pop();
        System.out.println("Minimum after pop: " + minStack.getMin()); // Should still print 2
        minStack.pop();
        System.out.println("Minimum after pop: " + minStack.getMin()); // Should print 3
    }
}
