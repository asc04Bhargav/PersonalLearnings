public class BankingClient {
    public static void main(String[] args) {
        BankAccount ba1 = new SavingsAccount(2);
        ba1.setActNumber(1234);
        ba1.setActBalance(30000.0);


        BankAccount ba2 = new SavingsAccount(3);  //This is Transferred Account details
        ba2.setActNumber(4567);
        ba2.setActBalance(12000);



        BankingOperationsImpl b1 = new BankingOperationsImpl();

        try {
            b1.deposit(ba1,2000);
        }catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            b1.withDraw(ba1,1000);
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            b1.showBalance(ba1);
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            b1.transferFunds(ba1, ba2, 4000);
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
