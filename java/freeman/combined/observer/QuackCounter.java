public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks;
    
    
    
    public void registerObserver(DuckObserver observer){
        duck.registerObserver(observer);
    }
    public void notifyObservers(){
        duck.notifyObservers();
    }
    public QuackCounter(Quackable duck){
        this.duck=duck;
        
    }
    public void quack(){
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }
}