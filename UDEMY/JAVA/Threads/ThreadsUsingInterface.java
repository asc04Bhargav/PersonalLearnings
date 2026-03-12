//This code is not running in the vs code but it is correct.

// we can create threads using Runnable interfaces.

class A implements Runnable{  //This class must have run() method.
    public void run(){
        for(int i=0;i<=6;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            };
        }
    }
    
}
class B implements Runnable{  //This class must have run() method.
    public void run(){
        for(int i=0;i<=6;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            };
        }
    }
    
}

public class ThreadsUsingInterface {
    public static void main(String[] args) {
        //object is created to class A,B but the reference is from Runnable interface.
        Runnable obj1= new A();   
        Runnable obj2= new B();

        //As Runnable is interface we have to create thread objects to run parallely.
        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
    
}
