public class DebitcardCheckout implements Checkout{
    double availableBalance = 10000.0;

    @Override
    public void processPayment(double checkoutAmount) {
        if (availableBalance > checkoutAmount){
            System.out.println("checkout through Debit card");
            System.out.println("Available balance is :" + (availableBalance - checkoutAmount));
        } else{
            System.out.println("Insufficient funds");
        }
    }
}
