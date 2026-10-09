import java.util.ArrayList;
import java.util.List;

public class BankManager {
    private List<Client> clientList;
    public static final String DEFAULT_CURRENCY = "USD";

    public BankManager() {
        this.clientList = new ArrayList<>();
    }

    public void registerClient(String firstName, String lastName) {
        clientList.add(new Client(firstName, lastName));
    }

    public Client getClient(int index) {
        if (index >= 0 && index < clientList.size()) {
            return clientList.get(index);
        }
        return null;
    }
}