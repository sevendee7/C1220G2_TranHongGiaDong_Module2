package _review_oop.src._bank_account_management;

public class Account {
    private long accountNumber;
    private String accountName;
    private double accountBalance;
    
    public void Account() {}

    public void Account(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public double Account(long accountNumber, String accountName) {
        this.accountBalance = 50;
        return accountBalance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
