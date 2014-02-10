public class RubberDuck implements Quackable{
    DuckObservable observable;
    public RubberDuck(){
        observable=new DuckObservable(this);
    }
    
    public void registerObserver(DuckObserver observer){
        observable.registerObserver(observer);
    }
    public void notifyObservers(){
        observable.notifyObservers();
    }
    public void quack(){
        System.out.println("Squeak");
        notifyObservers();
    }
}