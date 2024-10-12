public class BankCustomer {
    private String name; // Customer's name
    private String address; // Customer's address
    private SavingsAccount[] accounts; // Array to hold up to 3 SavingsAccounts
    private int accountCount; // Counter for the number of accounts

    // Constructor: Initializes name and address, and creates an array for accounts
    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new SavingsAccount[3]; // Allow up to 3 accounts
        this.accountCount = 0; // Start with 0 accounts
    }

    // Method to add a SavingsAccount
    public boolean addAccount(SavingsAccount account) {
        if (accountCount < 3) { // Check if there's space for more accounts
            accounts[accountCount++] = account; // Add account and increment count
            return true; // Successfully added
        } else {
            System.out.println("Cannot add more than 3 accounts.");
            return false; // Failed to add account
        }
    }

    // Method to compute the total savings across all accounts
    public double balance() {
        double totalBalance = 0.0;
        for (int i = 0; i < accountCount; i++) {
            totalBalance += accounts[i].getSavingsBalance(); // Add each account's balance
        }
        return totalBalance; // Return total balance
    }

    // Method to print a summary of all accounts
    public void summary() {
        System.out.println("Account Summary for " + name + ":");
        for (int i = 0; i < accountCount; i++) {
            SavingsAccount account = accounts[i];
            System.out.println("Account Number: " + account.getAccountNumber() +" Balance: " + account.getSavingsBalance());
        }
    }

    // Getters for name and address
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
}
