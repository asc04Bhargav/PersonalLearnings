public class DiscountedPrice {
    public void calDiscount(double actPrice, double discountPerc){
        double discountedPrice= actPrice - (actPrice*(discountPerc/100));

        System.out.println("ActualPrice is: "+ actPrice);
        System.out.println("discount Percentage is: "+ discountPerc);
        System.out.println("price after discount is: "+discountedPrice);


    }
}
