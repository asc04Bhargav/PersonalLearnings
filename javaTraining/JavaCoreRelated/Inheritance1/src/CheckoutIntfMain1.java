public class CheckoutIntfMain1 {
    public static void main(String[] args) {
//        Checkout c = new DebitcardCheckout();
//        c.processPayment(2000);
//
//        c = new CreditCardCheckout();
//        c.processPayment(3000);
//
//        c= new NetBankingCheckout();
//        c.processPayment(3500);

        CheckoutService cs = new CheckoutService();
        cs.processPayment(1500);
    }
}
