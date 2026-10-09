import java.util.ArrayList;

public class Bank {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Akun atas nama " + account.getOwnerName() + " berhasil ditambahkan.");
    }

    public static BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public static void displayAllAccounts() {
        System.out.println("\n--- Daftar seluruh akun ---");
        for (BankAccount acc : accounts) {
            System.out.println("No. Rek: " + acc.getAccountNumber() + " | Owner: " + acc.getOwnerName() + " | Saldo: Rp " + (int) acc.getBalance());
        }
        System.out.println();
    }
}