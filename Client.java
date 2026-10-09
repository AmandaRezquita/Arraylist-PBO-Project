import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private List<BankAccount> accounts;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void bindAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccountByNum(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }
}