import banking.BankAccount;

public class Test_bank {
    public static void main(String[] args){
        BankAccount b = new BankAccount("1234", 5000.0);

        b.deposite(2000.0);
        b.withdraw(1500.0);
        b.checkBalance();
    }
}
