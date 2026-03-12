public class InSufficientFundsException extends RuntimeException{

    double withdrawAmount;

    public InSufficientFundsException(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public String toString() {
        return "InSufficientFundsException{" +
                "withdrawAmount=" + withdrawAmount +
                '}';
    }
}
