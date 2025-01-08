
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        SavingsAccount savings = new SavingsAccount(1000, 10);
        account.deposit(500); // Calls deposit in BankAccount
        savings.deposit(500); // Calls overridden deposit in SavingsAccount 
        account.withdraw(600);
        System.out.println("BankAccount balance: " + account.getBalance());
        System.out.println("SavingsAccount balance: " + savings.getBalance());

        System.out.println("==================");

        SavingAccounts1 savings1 = new SavingAccounts1(1000, 5);
        CurrentAccount current = new CurrentAccount(500, 1000);
        savings1.deposit(500);
        //current.withdraw(700);
        current.withdraw(600);
        System.out.println("Savings Account Balance: " + savings1.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
