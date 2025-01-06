
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposited: " + amount + " with interest");
    }
    
    // Getters and Setters
    public double getInterestRate() {
        return interestRate;
    }
}
