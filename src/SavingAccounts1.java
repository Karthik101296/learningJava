
public class SavingAccounts1 implements Transaction {

    private double balance;
    private double interestRate;

    public SavingAccounts1(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposited: " + amount + " with interest. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Getters
    public double getBalance() {
        return balance;
    }
}
