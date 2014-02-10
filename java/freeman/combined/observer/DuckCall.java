public class DuckCall implements Quackable{
    DuckObservable observable;
    public DuckCall(){
        observable=new DuckObservable(this);
    }
    
    public void registerObserver(DuckObserver observer){
        observable.registerObserver(observer);
    }
    public void notifyObservers(){
        observable.notifyObservers();
    }
    public void quack(){
        System.out.println("Kwak");
        notifyObservers();
    }
}