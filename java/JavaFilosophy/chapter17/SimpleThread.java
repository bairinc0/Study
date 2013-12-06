public class SimpleThread extends Thread{
    private int countDown=5;
    private static int threadCount=0;
    private int myNumber;
    public SimpleThread(){
        super(Integer.toString(++threadCount));
        myNumber=threadCount;
        System.out.println("Thread #"+threadCount+" created!");
        start();
    }
    public String toString(){
        return "#"+getName()+"("+countDown+"),";
    }
    public void run(){
        while(true){
            System.out.print(this);
            if (--countDown==0){
                System.out.println("Thread ended:"+myNumber);
                return;
            }
        }
    }
    public static void main(String [] args){
        for (int i=0;i<5;i++){
            new SimpleThread();
        }
    }    
}