
abstract class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount); // Abstract method

    abstract void withdraw(double amount); // Abstract method

    public void checkBalance() { // Concrete method
        System.out.println("Current balance: " + balance);
    }
}
