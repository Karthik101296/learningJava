
public class BankingSystem {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        SavingsAccount savings = new SavingsAccount(1000, 10);
        account.deposit(500); // Calls deposit in BankAccount
        savings.deposit(500); // Calls overridden deposit in SavingsAccount 
        account.withdraw(600);
        System.out.println("BankAccount balance: " + account.getBalance());
        System.out.println("SavingsAccount balance: " + savings.getBalance());
    }
}
