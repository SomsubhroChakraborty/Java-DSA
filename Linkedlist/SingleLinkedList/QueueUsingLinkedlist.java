
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InnerQueueUsinglinkedlist{
    private Node font=null;
    private Node rear=null;
   

    public void Enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            font=rear=newNode;
        }
        rear.next = newNode;
        rear=newNode;
    }

    public int Dequeue(){
        if(font==null){
            System.out.println("Queue is empty");
        }
        int DequeueData = font.data;
        font = font.next;
        return DequeueData;
    }

    public void DisplayQueue(){
        Node current = font;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print ("NULL");
        
    }
}

public class QueueUsingLinkedlist {
    public static void main(String[] args) {
        InnerQueueUsinglinkedlist queue = new InnerQueueUsinglinkedlist();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Dequeue();
        queue.Dequeue();
        queue.DisplayQueue();
    }
}
