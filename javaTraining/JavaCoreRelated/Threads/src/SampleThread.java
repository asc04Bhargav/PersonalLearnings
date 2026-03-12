public class SampleThread implements Runnable{
    @Override
    public void run() {
        demo();
    }

    public void demo(){
        for (int i=1; i<=100; i++){
            System.out.println("Thread run() :" +i);
        }
    }

    public static void main(String[] args) {
        SampleThread st = new SampleThread();

        Thread x = new Thread(st);
        x.start();

        for (int i=1; i<=100; i++){
            System.out.println("Thread main() :" +i);
        }
    }


}
