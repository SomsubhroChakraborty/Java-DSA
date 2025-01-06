// Here are some Java threading problems for you to solve:

// Problem 1: Print Odd and Even Numbers Using Two Threads
// Write a program where two threads print odd and even numbers alternately up to 20.

// Input: None
// Output: 1 2 3 4 ... 20 (printed in alternating order by two threads).


package OOPS.Thread;


public class problem1 {
    
    private int number = 1;
    private final int  max_number = 20;
    private volatile boolean isOdd = true;

      public synchronized void printOdd() {
        for (int i = 1; i <=  max_number; i += 2) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Odd Thread: " + i);
            isOdd = false;
            notify();
        }
    }
    
    public synchronized void printEven() {
        for (int i = 2; i <=  max_number; i += 2) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Even Thread: " + i);
            isOdd = true;
            notify();
        }
    }
    
    public static void main(String[] args) {
        problem1 printer = new problem1();
        
        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());
        
        oddThread.start();
        evenThread.start();

}
}