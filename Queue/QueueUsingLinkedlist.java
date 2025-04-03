package Queue;

class Node{
   int data;
   Node next;
 
   public Node(int data){
    this.data = data;
    this.next = null;
   }
}
 class InnerQueueUsingLinkedlist {
private Node front = null;
private Node rear = null;

//Enqueue
public void Enqueue(int data){
    Node newNode = new Node(data);
    if (rear == null){
        front =rear =newNode;
    }
    else{
        rear.next = newNode;
        newNode.next=null;
        rear =newNode;
    }
}

//Dequeue
public int Dequeue(){
    if (rear == front){
        System.out.println("Queue is Empty");
    }
    
        int data = front.data;
        front = front.next;
        return data;
}

//Display
public void Display(){
    Node Current = front;
    while(Current!= null){
        System.out.print(Current.data + "=>");
        Current = Current.next;
    }
   System.out.print("Null");
}

}


public class QueueUsingLinkedlist {
    public static void main(String[] args) {
        InnerQueueUsingLinkedlist queue = new InnerQueueUsingLinkedlist();
        queue.Enqueue(0);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        queue.Enqueue(5);
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Display();
    }
}
