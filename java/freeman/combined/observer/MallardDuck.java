public class MallardDuck implements Quackable{
    DuckObservable observable;
    public MallardDuck(){
        observable=new DuckObservable(this);
    }
    
    public void registerObserver(DuckObserver observer){
        
        observable.registerObserver(observer);
    }
    public void notifyObservers(){
       // System.out.println("MALLARD");
        observable.notifyObservers();
    }
    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }
}