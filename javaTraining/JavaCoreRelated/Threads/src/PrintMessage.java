class PrintingThread extends Thread{
    PrintMessage pm ;
    String msg;

    public PrintingThread(){

    }

    public PrintingThread(PrintMessage pm, String msg){
        this.pm=pm;  this.msg=msg;

    }

    public  void run(){
        pm.print(msg);
    }

}

public class PrintMessage {

    synchronized public void print(String msg){
        System.out.print("[");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
        System.out.println(msg + "]");
    }
}
