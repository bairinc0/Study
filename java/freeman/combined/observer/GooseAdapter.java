public class GooseAdapter implements Quackable{
    Goose goose;
    DuckObservable observable;
    public GooseAdapter(Goose goose){
        this.goose=goose;
        observable=new DuckObservable(this);
    }
      
    public void registerObserver(DuckObserver observer){
        observable.registerObserver(observer);
    }
    public void notifyObservers(){
        observable.notifyObservers();
    }
    public void quack(){
        goose.honk();
        notifyObservers();
    }
}