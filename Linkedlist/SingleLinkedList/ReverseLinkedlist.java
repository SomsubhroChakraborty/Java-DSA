// Uncomment the package declaration if needed
// package Linkedlist.SingleLinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedlist {
    private Node head;
    
    // Method to reverse the linked list
    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head; // Nothing to reverse
        }

        Node prevNode = head;
        Node curNode = head.next;
        prevNode.next = null;

        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        return prevNode; // New head of the reversed list
    }

    // Helper method to print the linked list
    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test reversal
    public static void main(String[] args) {
        ReverseLinkedlist list = new ReverseLinkedlist();

        // Creating list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList(head);

        head = list.reverse(head);

        System.out.println("Reversed List:");
        list.printList(head);
    }
}