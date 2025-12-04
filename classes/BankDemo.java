class BankAccount {

    private double balance;   // data member

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();  // Create object

        acc.deposit(5000);       // Perform deposit
        acc.displayBalance();

        acc.withdraw(2000);      // Perform withdrawal
        acc.displayBalance();

        acc.withdraw(4000);      // Attempt to withdraw more
        acc.displayBalance();
    }
}
