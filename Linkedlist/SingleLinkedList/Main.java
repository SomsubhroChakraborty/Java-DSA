import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;
    
    public void insert(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
    }
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
    
    public void search(int key) {
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element " + key + " found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Element not found");
    }
    
    public void insertAfter(int key, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
    }
    
    public void deleteElement(int key) {
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head, prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }
        prev.next = temp.next;
    }
    
    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public void reverse() {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void concatenate(SinglyLinkedList otherList) {
        if (head == null) {
            head = otherList.head;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = otherList.head;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Search element");
            System.out.println("5. Insert after element");
            System.out.println("6. Delete specified element");
            System.out.println("7. Count nodes");
            System.out.println("8. Reverse list");
            System.out.println("9. Concatenate another list");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();
                    sll.insert(data, pos);
                    break;
                case 2:
                    System.out.print("Enter position: ");
                    pos = scanner.nextInt();
                    sll.delete(pos);
                    break;
                case 3:
                    sll.display();
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int key = scanner.nextInt();
                    sll.search(key);
                    break;
                case 5:
                    System.out.print("Enter element after which to insert: ");
                    key = scanner.nextInt();
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    sll.insertAfter(key, data);
                    break;
                case 6:
                    System.out.print("Enter element to delete: ");
                    key = scanner.nextInt();
                    sll.deleteElement(key);
                    break;
                case 7:
                    System.out.println("Number of nodes: " + sll.countNodes());
                    break;
                case 8:
                    sll.reverse();
                    break;
                case 9:
                    SinglyLinkedList sll2 = new SinglyLinkedList();
                    System.out.print("Enter number of elements in second list: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element: ");
                        sll2.insert(scanner.nextInt(), i);
                    }
                    sll.concatenate(sll2);
                    break;
                case 10:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
