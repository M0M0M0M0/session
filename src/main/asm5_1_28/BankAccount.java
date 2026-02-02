package main.asm5_1_28;

public class BankAccount {
    private String accountNumber;
    private Double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double depositAmount) {
        if (depositAmount > 0) setBalance(getBalance() + depositAmount);
        else System.out.println("So tien nop khong hop le.");
    }

    public void withdraw(Double withdrawAmount) {
        if (withdrawAmount > getBalance() || getBalance() < 0) System.out.println("So du trong tai khoan khong du");
        else setBalance(getBalance() - withdrawAmount);
    }

    public void printBalance() {
        System.out.println("So du hien tai cua ban la " + getBalance());
    }

}
