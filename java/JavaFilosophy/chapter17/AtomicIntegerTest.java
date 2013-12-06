import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.*;


public class AtomicIntegerTest implements Runnable{
    private AtomicInteger i=new AtomicInteger(0);
    public int getValue(){
        return i.get();
    }
    private void evenIncrement(){
        i.addAndGet(2);
    }
    public void run(){
        while (true){
            evenIncrement();
        }
    }
    public static void main(String [] args){
        new Timer().schedule(new TimerTask(){
            public void run(){
                System.err.println("Aborting!!!");
                System.exit(0);
            }
        },5000);        
        ExecutorService exec=Executors.newCachedThreadPool();
        AtomicIntegerTest at=new AtomicIntegerTest();
        exec.execute(at);
        while (true){
            int val=at.getValue();
            if (val%2!=0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}