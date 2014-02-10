import java.util.*;
public class DuckObservable implements QuackObservable{
    ArrayList observers=new ArrayList();
    QuackObservable duck;
    public DuckObservable(QuackObservable duck){
        this.duck=duck;
    }
    public void registerObserver(DuckObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        Iterator iterator=observers.iterator();
       
        while(iterator.hasNext()){
            DuckObserver observer=(DuckObserver)iterator.next();            
            observer.update(duck);
        }
    }
}