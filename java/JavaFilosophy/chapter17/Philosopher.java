import java.util.concurrent.*;
import java.util.*;

public class Philosopher implements Runnable{
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int ponderFactor;
    private Random rand=new Random(47);
    private void pause() throws InterruptedException{
        if (ponderFactor==0) return;
        TimeUnit.MILLISECONDS.sleep(ponderFactor*250);
    }
    public Philosopher(Chopstick left,Chopstick right,int ident,int ponder){
        this.left=left;
        this.right=right;
        id=ident;
        ponderFactor=ponder;
    }
    public void run(){
        try{
            while (!Thread.interrupted()){
                System.out.println(this+" is thinking");
                pause();
                System.out.println(this+" get Right");
                right.take();
                System.out.println(this+" get Left");
                left.take();
                System.out.println(this+" Eating");
                pause();
                right.drop();
                left.drop();
            }
        }
        catch(InterruptedException e){
            System.out.println(this+" exiting for Exception");
        }
    }
    public String toString(){
        return "Philosopher "+id;
    }
}