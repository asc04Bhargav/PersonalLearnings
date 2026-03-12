public class WelcomeChild extends Welcome{

    public void greet(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        WelcomeChild w1 = new WelcomeChild();

        w1.greet("Happy New Year..");
        w1.showFullName("Anjan","Bhargav");

    }

}
