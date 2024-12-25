// package Linkedlist.SingleLinkedList.Specificposition;
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

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If position is 0 or inserting at the head
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        // Traverse to the node just before the position
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // If position is invalid (greater than the list size)
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node at the position
        newNode.next = current.next;
        current.next = newNode;
    }
}

// Main class to test the linked list
public class Specificposition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List:");
        list.printList();

        // Inserting at position 2
        list.insertAtPosition(25, 2);
        System.out.println("After Inserting 25 at position 2:");
        list.printList();

        // Inserting at position 0 (head)
        list.insertAtPosition(5, 0);
        System.out.println("After Inserting 5 at position 0:");
        list.printList();

        // Inserting at an out-of-bounds position
        list.insertAtPosition(50, 10);
    }
}
