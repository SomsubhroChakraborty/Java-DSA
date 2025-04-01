import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class InnerStackUsinglinkedlist {
    private Node top;
    
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top ==null){
            System.out.println("stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    
    public int peek(){
        if(top == null){
            System.out.println("stack is empty");
        }
        return top.data;
    }

    public void printStack(){
        Node current =top;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print ("NULL");
    }

}
public class StackUsinglinkedlist {
    public static void main(String[] args) {
        InnerStackUsinglinkedlist stack = new InnerStackUsinglinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
