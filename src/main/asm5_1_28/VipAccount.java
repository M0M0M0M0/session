package main.asm5_1_28;

public class VipAccount extends BankAccount {
    public VipAccount() {
    }

    public VipAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(Double depositAmount) {
        if (depositAmount > 0) setBalance(getBalance() + depositAmount * 1.01);
        else System.out.println("So tien nop khong hop le.");
    }

    @Override
    public void withdraw(Double withdrawAmount) {
        super.withdraw(withdrawAmount);
    }
}
