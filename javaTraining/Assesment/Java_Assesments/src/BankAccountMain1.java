public class BankAccountMain1 {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1();
        b1.accNumber = 1234556787;
        b1.custName ="Bhargav";
        b1.accBalance=1000;

        b1.withdrawl(500);
        b1.deposit(6000);
    }
}
