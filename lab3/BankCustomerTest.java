public class BankCustomerTest {
    public static void main(String[] args) {
        // Create a bank customer
        BankCustomer customer = new BankCustomer("Nikolozi Gagua", "123 carlow");

        // Create savings accounts for the customer
        SavingsAccount account1 = new SavingsAccount(2000.00, 4.0);
        SavingsAccount account2 = new SavingsAccount(3000.00, 5.0);
        SavingsAccount account3 = new SavingsAccount(1500.00, 3.5);

        // Add accounts to the customer
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3);
        
        
        // add a fourth account
        SavingsAccount account4 = new SavingsAccount(2500.00, 6.0);
        customer.addAccount(account4); 

        //total balance
        System.out.println("Total Savings: " + customer.balance());

        //account summary
        customer.summary();
    }
}
