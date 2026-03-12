public class AccountNotFoundException extends Exception{
    int accountNumber;

    public AccountNotFoundException(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account Not Valid with" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
