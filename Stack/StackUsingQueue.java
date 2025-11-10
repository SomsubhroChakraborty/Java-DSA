package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int data){
        q2.add(data);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;
    }

    int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
       return q1.remove();
    }

    void display(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top -> Bottom"+q1);
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        // System.out.println("Top element: " + stack.top()); // 30 
        // System.out.println("Popped: " + stack.pop()); // 30 
        // System.out.println("Popped: " + stack.pop()); // 20 
        stack.display();
    }
}
