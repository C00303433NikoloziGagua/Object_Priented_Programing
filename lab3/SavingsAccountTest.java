public class SavingsAccountTest {
    public static void main(String[] args) {
        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(4.0);

        // Create two savings account objects with instant interest addition
        SavingsAccount saver1 = new SavingsAccount(2000.00, 4.0);
        SavingsAccount saver2 = new SavingsAccount(3000.00, 4.0);
        // Display balances after the interest is instantly added
        System.out.println("Balances after applying monthly interest at 4%:");
        System.out.println("Saver 1 Balance: "+ saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: "+ saver2.getSavingsBalance());

        // Modify interest rate to 5% for the next month
        SavingsAccount.modifyInterestRate(5.0);

        // Calculate and apply interest for the next month with the new rate
        saver1.setSavingsBalance(saver1.getSavingsBalance() + saver1.calculateMonthlyInterest());
        saver2.setSavingsBalance(saver2.getSavingsBalance() + saver2.calculateMonthlyInterest());

        // Display balances after applying new monthly interest at 5%
        System.out.println("/nBalances after monthly interest at 5%:");
        System.out.println("Saver 1 Balance: "+ saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: "+ saver2.getSavingsBalance());
    }
}
