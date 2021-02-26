package day1;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void transfer(BankAccount otherBankAccount, double amount) throws InsufficientBalanceException {
        if(this.amount < amount) {
            throw new InsufficientBalanceException(Math.abs(this.amount - amount));
        } else {
            this.amount -= amount;
            otherBankAccount.setAmount(otherBankAccount.getAmount() + amount);
        }
    }
}
