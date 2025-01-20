// Problem 5: Simulate a Bank Account System
// Create a bank account system with two threads:

// Thread 1 deposits money into the account.
// Thread 2 withdraws money from the account.
// Ensure that withdrawals cannot occur if the balance is insufficient.
package OOPS.Thread;




class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        notify(); // Notify waiting threads
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance for withdrawal of: " + amount + ", Current Balance: " + balance);
            try {
                wait(); // Wait until sufficient balance is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread is interrupted");
            }
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }
}

public class problem5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread for deposits
        Thread depositThread = new Thread(() -> {
            int[] deposits = {100, 200, 300, 400};
            for (int amount : deposits) {
                account.deposit(amount);
                try {
                    Thread.sleep(100); // Simulate time delay between deposits
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread for withdrawals
        Thread withdrawThread = new Thread(() -> {
            int[] withdrawals = {150, 250, 100, 500};
            for (int amount : withdrawals) {
                account.withdraw(amount);
                try {
                    Thread.sleep(150); // Simulate time delay between withdrawals
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        depositThread.start();
        withdrawThread.start();
    }
}
