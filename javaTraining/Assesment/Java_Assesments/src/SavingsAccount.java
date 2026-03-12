public class SavingsAccount extends BankAccount{

    private int interestRate;

    public SavingsAccount(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
