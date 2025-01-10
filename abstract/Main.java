
public class Main {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 5);
        savings.deposit(500);
        savings.withdraw(200);
        savings.checkBalance(); // Calls the concrete method from BankAccount
    }
}
