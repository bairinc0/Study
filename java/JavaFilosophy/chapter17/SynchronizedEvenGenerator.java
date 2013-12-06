public class SynchronizedEvenGenerator extends IntGenerator{
    private int currentEvenValue=0;
    public synchronized int next(){
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        if (currentEvenValue%100000==0){
            System.out.println("One HUNDRED THOUSAND!");
        }
        return currentEvenValue;
    }
    public static void main(String [] args){
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}