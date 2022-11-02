package poo_basic.inheritance;

public class BankAccount {
    private String accountNumber;
    private int accountBalance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void increase (int num) {
        accountBalance = accountBalance + num;
    }

    public void decrease (int num) {
        if (accountBalance - num >= 0) {
            accountBalance = accountBalance - num;
        }
    }
}
