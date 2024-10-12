public class SavingsAccount {
    private static int accountNumberCount = 1;
    private double savingsBalance;
    private static double annualInterestRate; // Static because all accounts share the same interest rate
    private int accountNumber;

    // Constructor: Adds interest instantly upon account creation
    public SavingsAccount(double savingsBalance, double annualInterestRate) {
        this.savingsBalance = savingsBalance; // Initialize the balance first
        SavingsAccount.annualInterestRate = annualInterestRate; // Set the static annual interest rate
        this.savingsBalance += calculateMonthlyInterest(); // Add monthly interest to the balance instantly
        this.accountNumber = accountNumberCount++;
    }

    // Setters and Getters
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static void modifyInterestRate(double newRate) {
        SavingsAccount.annualInterestRate = newRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Method to calculate monthly interest based on the current balance and interest rate
    public double calculateMonthlyInterest() {
        return (savingsBalance * annualInterestRate / 12) / 100;
    }
}
