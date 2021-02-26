package day1;

public class InsufficientBalanceException extends Exception{
    private double missingAmount;

    public InsufficientBalanceException(double missingAmount) {
        super("Es fehlen " + missingAmount + " Euro");
        this.missingAmount = missingAmount;
    }

    public double getMissingAmount() {
        return missingAmount;
    }

    public void setMissingAmount(double missingAmount) {
        this.missingAmount = missingAmount;
    }
}
