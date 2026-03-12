
class A extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);           //by default sleep is checked exception so we have to handle it by using try catch.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {        //we should have atleast one run() method in threas class.
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsUsingClass {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();       //this method is used to start running the thread by default it will execute run() method.
        obj2.start();
    }
}
