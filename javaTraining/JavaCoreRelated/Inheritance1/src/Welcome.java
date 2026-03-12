abstract public class Welcome {
    public abstract void greet(String msg);

    //abstract class can contain abstract and non-abstract methods(Concrete methods).

    public void showFullName(String fname,String lname){
        System.out.println("Hello ==>" +fname +" "+ lname);
    }
}
