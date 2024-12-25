package OOPS.Inheritance;

class Account {
    String accountNumber;
    double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    // Constructor
    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Methods
    void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Methods
    @Override
    void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded");
        } else {
            balance -= amount;
        }
    }
}

public class problem2 {
    public static void main(String[] args) {
        // Create accounts
        SavingAccount savingAccount = new SavingAccount("SA12345", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA67890", 500.0, 1000.0);

        // Perform operations
        System.out.println("Initial balances:");
        savingAccount.display();
        currentAccount.display();

        System.out.println("\nDepositing money:");
        savingAccount.deposit(200);
        currentAccount.deposit(300);
        savingAccount.display();
        currentAccount.display();

        System.out.println("\nWithdrawing money:");
        savingAccount.withdraw(500);
        currentAccount.withdraw(1000);
        savingAccount.display();
        currentAccount.display();

        System.out.println("\nAdding interest to Savings Account:");
        savingAccount.addInterest();
        savingAccount.display();

        System.out.println("\nWithdrawing beyond overdraft limit:");
        currentAccount.withdraw(2000); // Overdraft limit exceeded
        currentAccount.display();
    }
}
