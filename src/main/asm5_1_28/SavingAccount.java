package main.asm5_1_28;

public class SavingAccount extends BankAccount {
    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        super.withdraw(withdrawAmount * 1.02);
    }
}
