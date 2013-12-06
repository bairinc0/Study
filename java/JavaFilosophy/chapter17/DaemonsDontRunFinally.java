import java.util.concurrent.*;

class ADaemon implements Runnable{
    
    public void run(){
        try{
            System.out.println("Start ADaemon");
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        finally{
            System.out.println("I AM FINALLY!!");
        }
    }
}

public class DaemonsDontRunFinally{
    public static void main(String [] args) throws Exception{
        Thread d=new Thread(new ADaemon());
        d.setDaemon(true);
        d.start();    
        TimeUnit.SECONDS.sleep(1);
    }
}