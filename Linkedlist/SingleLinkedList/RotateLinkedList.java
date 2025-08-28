import java.util.List;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next =null;
    }
}


public class RotateLinkedList {
// private Node head;

public static Node Rotate(Node head , int k){
    if(k==0 || head == null){
        return head;
    }
        for(int i=0 ; i<=k ; ++i){
            Node curr = head;
            while(curr.next !=null){

                curr.next=curr;
                curr = curr.next;
                head = head.next;
                curr.next=null;
            }
        }
        return head;
}

static void printList(Node node){
    while(node!=null){
        System.out.println(node+ " ");
        node=node.next;
    }
    System.out.println("null");
}

    public static void main(String[] args) {
       RotateLinkedList list = new  RotateLinkedList();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = list.Rotate(head,6);
        list.printList(head);
    }
}
