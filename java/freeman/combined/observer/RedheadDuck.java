public class RedheadDuck implements Quackable{
    DuckObservable observable;
    public RedheadDuck(){
        observable=new DuckObservable(this);
    }
    
    public void registerObserver(DuckObserver observer){
        observable.registerObserver(observer);
    }
    public void notifyObservers(){
        observable.notifyObservers();
    }
    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }
}