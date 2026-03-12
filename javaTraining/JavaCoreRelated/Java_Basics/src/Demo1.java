public class Demo1 {
    int x;
    Demo1(){
        this(10);  //this will call the constructor of the same class i.e. Demo1(int x).
        System.out.println("Inside the Demo1 default constructor");
    }

    Demo1(int x){
        System.out.println("Inside the Demo1 Parameter constructor");
        this.x =x;
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1(10);
        Demo1 d2 = new Demo1(20);
        Demo1 d3 = new Demo1();

        System.out.println(d1.x + " "+ d2.x +" "+ d3.x);
    }
}
