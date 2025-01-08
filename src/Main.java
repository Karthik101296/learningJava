
public class Main {

    public static void main(String[] args) {
        SavingAccounts1 savings = new SavingAccounts1(1000, 10);
        CurrentAccount current = new CurrentAccount(500, 1000);
        savings.deposit(500);
        //current.withdraw(700);
        current.withdraw(1700);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
