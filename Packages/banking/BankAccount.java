package banking;

public class BankAccount {
    String accountNumber;
    Double balance;
    
    public BankAccount(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposite(Double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(Double amount){
        if(amount > balance){
            System.out.println("Insufficient Funds");
        }
        else{
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        }
    }

    public void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
