public class SleepDemo {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            System.out.println("hello...");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
