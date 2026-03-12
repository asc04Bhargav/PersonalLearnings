public class BankAccount1 {
    long accNumber;
    String custName;
    double accBalance;

    public void withdrawl(double howMuch){
        if (accBalance >= howMuch){
            accBalance = accBalance- howMuch;
            System.out.println("amount withdrawl initiated");
            System.out.println("your current balance is "+ accBalance);

        }
        else {
            System.out.println("Insufficent Balance");
        }
    }

    public void deposit(double howMuch){
        accBalance = accBalance+ howMuch;
        System.out.println("Amount Deposited");
        System.out.println("Your current balance is :" + accBalance);
    }

}
