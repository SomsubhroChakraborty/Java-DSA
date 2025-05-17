

package Queue;

import java.util.Stack;

public class QueueUsingstack {
  Stack<Integer> stack1 = new Stack<>();  //for enqueue operation
  Stack<Integer> stack2 = new Stack<>(); //For dequeue operation
  
public void enqueue(int x){
    stack1.add(x);
}
public int dequeue(){
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
    }
    if(stack2.isEmpty()){
        System.out.println("The Queue is empty ");
        return -1;

    }
    return stack2.pop();
}
public static void main(String[] args) {
    QueueUsingstack queue = new QueueUsingstack();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
  
}
  
}
