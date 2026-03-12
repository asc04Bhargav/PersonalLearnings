public class GreetIntfMain1 {
    public static void main(String[] args) {
//        Greet g = new BirthdayGreet();
//        g.wish("Happy Birthday");
//        g = new NewyearGreet();
//        g.wish("Happy new Year");
//        g = new PongalGreet();
//        g.wish("Happy Pongal");

        GreetService gs = new GreetService();
        gs.wish("Scott");
    }
}
