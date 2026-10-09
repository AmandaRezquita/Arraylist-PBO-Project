public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public static void deposit(BankAccount acc, double amount) {
        acc.balance += amount;
        System.out.println(acc.ownerName + " - Deposit: Rp " + (int) amount);
        System.out.println("Current balance: Rp " + (int) acc.balance);
        System.out.println();
    }

    public static void withdraw(BankAccount acc, double amount) {
        if (amount > acc.balance) {
            System.out.println(acc.ownerName + " - Insufficient balance to withdraw: Rp " + (int) amount);
            System.out.println();
            return;
        }
        acc.balance -= amount;
        System.out.println(acc.ownerName + " - Withdraw: Rp " + (int) amount);
        System.out.println("Current balance: Rp " + (int) acc.balance);
        System.out.println();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}