package Linkedlist.CyclicLinkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCircularLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        
        if (head == null) { // Insert into an empty list
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
            size++;
            return;
        }

        if (position == 1) { // Insert at front
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
            size++;
            return;
        }

        if (position >= size + 1) { // Insert at end
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
            size++;
            return;
        }

        // Insert at any position
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        if (position < 1 || position > size) {
            System.out.println("Invalid position. Valid positions are 1 to " + size);
            return;
        }

        int deletedData;

        if (size == 1) { // Only one node in the list
            deletedData = head.data;
            head = null;
            tail = null;
            size--;
            System.out.println(deletedData + " deleted from the list");
            return;
        }

        if (position == 1) { // Delete from front
            deletedData = head.data;
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
            System.out.println(deletedData + " deleted from the front");
            return;
        }

        if (position == size) { // Delete from end
            deletedData = tail.data;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
            System.out.println(deletedData + " deleted from the end");
            return;
        }

        // Delete from intermediate position
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        deletedData = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println(deletedData + " deleted from position " + position);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(circular)");
    }
}

public class DoublylinkedCircularlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyCircularLinkedList dll = new DoublyCircularLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            int data, pos;

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    pos = scanner.nextInt();
                    dll.insert(data, pos);
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    pos = scanner.nextInt();
                    dll.delete(pos);
                    break;
                case 3:
                    dll.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
