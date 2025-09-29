import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accNo, String holder, double initialDeposit) {
        if (!accounts.containsKey(accNo)) {
            Account account = new Account(accNo, holder, initialDeposit);
            accounts.put(accNo, account);
            System.out.println("Account created successfully for " + holder);
        } else {
            System.out.println("Account number already exists.....!");
        }
    }

    public Account getAccount(String accNo) {
        return accounts.get(accNo);
    }

    public void listAccounts() {
        System.out.println("\n--- List of Accounts ---");
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.....");
        } else {
            for (Account acc : accounts.values()) {
                System.out.println(acc.getAccountNumber() + " - " + acc.getAccountHolder());
            }
        }
    }
}
