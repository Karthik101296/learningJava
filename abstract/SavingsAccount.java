
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposited: " + amount + " with interest.");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
