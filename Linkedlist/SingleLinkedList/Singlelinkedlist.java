// package Linkedlist.SingleLinkedList;

// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    private Node head;
 // Add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

// Main class to test the linked list
public class Singlelinkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List:");
        list.printList(); 

        list.delete(20);
        System.out.println("After Deleting 20:");
        list.printList(); 
    }
}
