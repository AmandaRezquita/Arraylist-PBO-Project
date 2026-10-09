import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    // Helper untuk membuat border horizontal
    private static void printLine(char ch, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    // Helper untuk sub-header menu
    private static void printSectionHeader(String title) {
        System.out.println();
        printLine('─', 44);
        System.out.printf("  %-40s\n", title);
        printLine('─', 44);
    }

    public static void main(String[] args) {
        BankManager manager = new BankManager();
        manager.registerClient("Amanda", "Rezquita");
        Client client = manager.getClient(0);
        client.bindAccount(new BankAccount(1200.0));

        BankAccount activeAccount = client.getAccountByNum(0);

        while (true) {
            // Header Utama
            System.out.println("\n┌──────────────────────────────────────────┐");
            System.out.println("│          DIGITAL ATM TERMINAL            │");
            System.out.printf("│  Client : %-30s │\n", client.getFullName());
            System.out.println("├──────────────────────────────────────────┤");
            System.out.println("│  [1] Balance Enquiry                     │");
            System.out.println("│  [2] Credit Account (Deposit)            │");
            System.out.println("│  [3] Debit Account (Withdraw)            │");
            System.out.println("│  [4] Terminate Session                   │");
            System.out.println("└──────────────────────────────────────────┘");
            System.out.print("Select action > ");

            // Validasi jika input bukan angka
            if (!input.hasNextInt()) {
                System.out.println("\n[!] INVALID INPUT: Please enter a numeric option.");
                input.next(); 
                continue;
            }

            int action = input.nextInt();

            if (action == 1) {
                printSectionHeader("ACCOUNT BALANCE ENQUIRY");
                System.out.printf("  Available Balance : %.2f %s\n", 
                        activeAccount.getBalanceAmount(), BankManager.DEFAULT_CURRENCY);
                printLine('─', 44);

            } else if (action == 2) {
                printSectionHeader("CREDIT TRANSACTION (DEPOSIT)");
                System.out.print("  Enter deposit value : ");
                double val = input.nextDouble();

                if (activeAccount.deposit(val)) {
                    System.out.println("\n  [✓] SUCCESS: Fund deposited successfully.");
                    System.out.printf("  New Balance        : %.2f %s\n", 
                            activeAccount.getBalanceAmount(), BankManager.DEFAULT_CURRENCY);
                } else {
                    System.out.println("\n  [✕] ERROR: Invalid amount specified.");
                }
                printLine('─', 44);

            } else if (action == 3) {
                printSectionHeader("DEBIT TRANSACTION (WITHDRAW)");
                System.out.print("  Enter withdrawal value : ");
                double val = input.nextDouble();

                if (activeAccount.withdraw(val)) {
                    System.out.println("\n  [✓] SUCCESS: Fund withdrawn successfully.");
                    System.out.printf("  Remaining Balance  : %.2f %s\n", 
                            activeAccount.getBalanceAmount(), BankManager.DEFAULT_CURRENCY);
                } else {
                    System.out.println("\n  [✕] ERROR: Operation rejected (Insufficient funds).");
                }
                printLine('─', 44);

            } else if (action == 4) {
                printSectionHeader("SESSION TERMINATED");
                System.out.println("  Thank you for using our service.");
                System.out.println("  Have a great day, " + client.getFullName() + "!");
                printLine('─', 44);
                break;

            } else {
                System.out.println("\n[!] INVALID SELECTION: Choice out of range (1-4).");
            }
        }
    }
}