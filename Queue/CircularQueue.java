package Queue;


import java.util.Scanner;

class CircularQueueLogic {
    private int[] queue;
    private int front, rear, size, count;

    // Constructor to initialize the queue
    public CircularQueueLogic(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return count == size;
    }

    // Method to enqueue (add) an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            if (front == -1) {  // If queue is empty
                front = 0;
            }
            rear = (rear + 1) % size;  // Circular increment of rear
            queue[rear] = value;
            count++;
            System.out.println("Enqueued: " + value);
        }
    }

    // Method to dequeue (remove) an element from the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % size;  // Circular increment of front
            count--;
        }
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = 0; i < count; i++) {
                System.out.print(queue[(front + i) % size] + " ");
            }
            System.out.println();
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();

        CircularQueueLogic queue = new CircularQueueLogic(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}






