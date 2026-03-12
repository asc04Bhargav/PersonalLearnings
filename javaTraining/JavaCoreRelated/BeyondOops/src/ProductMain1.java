public class ProductMain1 {
    public static void main(String[] args) {
        Product p1 = new Product(100,"s25-Ultra");
        String s= p1.toString();
        System.out.println(s);

        Product p2 = new Product(100,"s25-Ultra");
        System.out.println(p1.equals(p1));
    }

}
