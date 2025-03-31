package Linkedlist.DoubleLinkedlist;

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

class DoubleLinkedlist {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void insert(int data, int position) {
        Node newNode = new Node(data);

        // Insert into an empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        // Insert at front
        if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
            return;
        }

        // Insert at end
        if (position >= size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            return;
        }

        // Insert at any position
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current.next != null) {
                current = current.next;
            }
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
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

        // Case 1: Only one node in the list
        if (size == 1) {
            deletedData = head.data;
            head = null;
            tail = null;
            size--;
            System.out.println(deletedData + " deleted from the list");
            return;
        }

        // Case 2: Delete from front
        if (position == 1) {
            deletedData = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            System.out.println(deletedData + " deleted from the front");
            return;
        }

        // Case 3: Delete from end
        if (position == size) {
            deletedData = tail.data;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
            size--;
            System.out.println(deletedData + " deleted from the end");
            return;
        }

        // Case 4: Delete from intermediate position
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        deletedData = current.data;
        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        size--;
        System.out.println(deletedData + " deleted from position " + position);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
}

public class Doublylinkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedlist dll = new DoubleLinkedlist();

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
