// Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
// indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the threads
// run in an infinite loop. However, thread “t1” must not increase “x” till that value of “x” is
// printed by “t2” and “t2” must not print the same value of “x” more than once.

package OOPS.Thread;

class SharedResource {
    private int x = 0;
    private boolean print = true;

    public synchronized void increase() {
        while (!print) {
            try {
                wait(); // Wait until the value is printed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread is interrupted");
            }
        }
        x++;
        System.out.println("Increased to: " + x);
        print = false; // Mark as not printed
        notify(); // Notify the display thread
    }

    public synchronized void display() {
        while (print) {
            try {
                wait(); // Wait until the value is incremented
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread is interrupted");
            }
        }
        System.out.println("Displayed: " + x);
        print = true; // Mark as printed
        notify(); // Notify the increment thread
    }
}

public class problem5 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(() -> {
            while (true) {
                sharedResource.increase();
                try {
                    Thread.sleep(100); // Optional delay for better visibility
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                sharedResource.display();
                try {
                    Thread.sleep(100); // Optional delay for better visibility
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
