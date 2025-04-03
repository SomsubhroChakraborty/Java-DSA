package Queue;

import java.util.Scanner;

public class Deque<T> {
    private T[] deque;
    private int front, rear;
    private int maxSize;

    // Constructor to initialize the deque with a specified size
    public Deque(int size) {
        maxSize = size;
        // Create a generic array
        deque = (T[]) new Object[maxSize];
        front = rear = -1;
    }

    // Function to check if the deque is full
    public boolean isFull() {
        return (front == 0 && rear == maxSize - 1) || (front == rear + 1);
    }

    // Function to check if the deque is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Function to insert an element at the left end
    public void insertLeft(T value) {
        if (isFull()) {
            System.out.println("Overflow! Deque is full.");
            return;
        }

        // If deque is empty, set both front and rear to 0
        if (isEmpty()) {
            front = rear = 0;
        }
        // If front is at the beginning, wrap around to the end
        else if (front == 0) {
            front = maxSize - 1;
        } else {
            front--;
        }
        deque[front] = value;
        System.out.println("Inserted " + value + " at the left end.");
    }

    // Function to insert an element at the right end
    public void insertRight(T value) {
        if (isFull()) {
            System.out.println("Overflow! Deque is full.");
            return;
        }

        // If deque is empty, set both front and rear to 0
        if (isEmpty()) {
            front = rear = 0;
        }
        // If rear is at the end, wrap around to the beginning
        else if (rear == maxSize - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = value;
        System.out.println("Inserted " + value + " at the right end.");
    }

    // Function to remove an element from the left end
    public void removeLeft() {
        if (isEmpty()) {
            System.out.println("Underflow! Deque is empty.");
            return;
        }

        System.out.println("Removed " + deque[front] + " from the left end.");

        // If there is only one element
        if (front == rear) {
            front = rear = -1; // Deque becomes empty
        } else if (front == maxSize - 1) {
            front = 0; // Wrap around to the beginning
        } else {
            front++;
        }
    }

    // Function to remove an element from the right end
    public void removeRight() {
        if (isEmpty()) {
            System.out.println("Underflow! Deque is empty.");
            return;
        }

        System.out.println("Removed " + deque[rear] + " from the right end.");

        // If there is only one element
        if (front == rear) {
            front = rear = -1; // Deque becomes empty
        } else if (rear == 0) {
            rear = maxSize - 1; // Wrap around to the end
        } else {
            rear--;
        }
    }

    // Function to display the elements in the deque
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.print("Deque elements: ");
        if (front <= rear) {
            // Normal case
            for (int i = front; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
        } else {
            // Circular case
            for (int i = front; i < maxSize; i++) {
                System.out.print(deque[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
        }
        System.out.println();
    }

    // Menu-driven program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Deque of Integer type with a maximum size of 5
        Deque<Integer> deque = new Deque<>(5);
        int choice, value;

        while (true) {
            System.out.println("\nDeque Operations Menu:");
            System.out.println("1. Insert at Left");
            System.out.println("2. Insert at Right");
            System.out.println("3. Remove from Left");
            System.out.println("4. Remove from Right");
            System.out.println("5. Display Deque");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at left: ");
                    value = scanner.nextInt();
                    deque.insertLeft(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at right: ");
                    value = scanner.nextInt();
                    deque.insertRight(value);
                    break;
                case 3:
                    deque.removeLeft();
                    break;
                case 4:
                    deque.removeRight();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}