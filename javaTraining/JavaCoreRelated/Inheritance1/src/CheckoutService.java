public class CheckoutService {
    Checkout dc = new DebitcardCheckout();

    public void processPayment(double checkoutAmount){
        dc.processPayment(checkoutAmount);
    }
}
