public class CreditCardCheckout implements Checkout{
    double availableBalance = 10000.0;


    public void processPayment(double checkoutAmount) {
        if (availableBalance > checkoutAmount){
            System.out.println("checkout through Credit card");
            System.out.println("Available balance is :" + (availableBalance - checkoutAmount));
        } else{
            System.out.println("Insufficient funds");
        }
    }
}
