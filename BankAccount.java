public class BankAccount {
    protected double balanceAmount;

    public BankAccount(double initialBalance) {
        this.balanceAmount = initialBalance;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balanceAmount >= amount) {
            balanceAmount -= amount;
            return true;
        }
        return false;
    }
}