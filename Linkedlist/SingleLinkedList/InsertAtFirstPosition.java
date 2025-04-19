// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

// Linked List class
class LinkedList {
    private Node head;
    private int size;

    // Add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        size++;
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
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    // Insert using recursion
    public void insertRec(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Position out of bounds");
            return;
        }
        head = insertrec(val, index, head);
        size++;
    }

    private Node insertrec(int val, int index, Node node) {
        if (index == 0) {
            return new Node(val, node);
        }
        node.next = insertrec(val, index - 1, node.next);
        return node;
    }

    // Insert a node at the first position
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert at specific position
    public void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Position out of bounds");
            return;
        }

        if (position == 0) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
}

// Main class
public class InsertAtFirstPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List:");
        list.printList();

        list.insertAtFirst(5);
        System.out.println("After Inserting 5 at the first position:");
        list.printList();

        list.insertAtPosition(25, 2);
        System.out.println("After Inserting 25 at position 2:");
        list.printList();

        list.insertRec(7, 4);
        System.out.println("After inserting 7 at position 4 using recursion:");
        list.printList();
    }
}
