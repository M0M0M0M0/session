package main.asm5_1_28;

public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        if ((withdrawAmount - super.getBalance()) < -5000000 || super.getBalance() < -5000000)
            System.out.println("So du trong tai khoan khong the thap hon -5.000.000");
        else super.setBalance(getBalance() - withdrawAmount);
    }
}
