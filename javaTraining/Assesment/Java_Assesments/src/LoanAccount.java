public class LoanAccount extends BankAccount{
    private int actualLoanAmount;
    private int paidLoanAmount;

    public LoanAccount(int actualLoanAmount, int paidLoanAmount) {
        this.actualLoanAmount = actualLoanAmount;
        this.paidLoanAmount = paidLoanAmount;
    }

    public int getActualLoanAmount() {
        return actualLoanAmount;
    }

    public void setActualLoanAmount(int actualLoanAmount) {
        this.actualLoanAmount = actualLoanAmount;
    }

    public int getPaidLoanAmount() {
        return paidLoanAmount;
    }

    public void setPaidLoanAmount(int paidLoanAmount) {
        this.paidLoanAmount = paidLoanAmount;
    }
}
