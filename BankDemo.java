public class BankDemo {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Bank BNI ===");

        BankAccount acc1 = new BankAccount("101", "Budi", 100000);
        BankAccount acc2 = new BankAccount("102", "Siti", 250000);

        Bank.addAccount(acc1);
        Bank.addAccount(acc2);

        Bank.displayAllAccounts();

        BankAccount targetAccount = Bank.findAccount("102");
        if (targetAccount != null) {
            BankAccount.deposit(targetAccount, 500000);
            BankAccount.withdraw(targetAccount, 150000);
        } else {
            System.out.println("Akun tidak ditemukan.");
        }
    }
}