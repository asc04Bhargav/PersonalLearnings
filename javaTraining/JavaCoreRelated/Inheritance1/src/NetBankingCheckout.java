public class NetBankingCheckout implements Checkout{
    double availableBalance = 10000.0;

    @Override
    public void processPayment(double checkoutAmount) {
        if (availableBalance > checkoutAmount){
            System.out.println("checkout through Net Banking");
            System.out.println("Available balance is :" + (availableBalance - checkoutAmount));
        } else{
            System.out.println("Insufficient funds");
        }
    }
}
