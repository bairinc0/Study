import java.util.concurrent.*;

class Daemon implements Runnable{
    private Thread [] t=new Thread[10];
    public void run(){
        for (int i=0;i<t.length;i++){
            t[i]=new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println("DaemonSpawn "+i+" started");
        }
        for (int i=0;i<t.length;i++){
            System.out.print("t["+i+"].isDaemon()="+t[i].isDaemon()+",");
        }
        while (true) {
            Thread.yield();
        }    
    }
}
class DaemonSpawn implements Runnable{
    private int count=0;
    public void run(){
        while (true){
            if (count<2){
                System.out.println(this);
                count++;
            }    
            Thread.yield();
        }
    }
}
public class Daemons{
    public static void main(String [] args) throws Exception{
        Thread d=new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.print("d.isDaemon()="+d.isDaemon()+",");
        TimeUnit.SECONDS.sleep(1);
    }
}