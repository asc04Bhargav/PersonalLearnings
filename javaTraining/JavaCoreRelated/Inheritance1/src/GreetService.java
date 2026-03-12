public class GreetService {
    Greet g = new BirthdayGreet();
    public void wish(String msg){
        g.wish(msg);
    }
}
