// package Linkedlist.SingleLinkedList;

// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

// Linked List class
class LinkedList {
    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Merge two sorted linked lists
    public static Node merge(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.data < l2.data) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class to test merge
public class MergeLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(3);
        l1.add(5);

        LinkedList l2 = new LinkedList();
        l2.add(2);
        l2.add(4);
        l2.add(6);

        Node mergedHead = LinkedList.merge(l1.head, l2.head);

        LinkedList result = new LinkedList();
        result.head = mergedHead;

        System.out.println("Merged Sorted List:");
        result.printList();
    }
}
