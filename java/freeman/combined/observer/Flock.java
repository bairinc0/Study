import java.util.*;
public class Flock implements Quackable{
    ArrayList quackers=new ArrayList();
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    public void quack(){
        Iterator iterator=quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker=(Quackable)iterator.next();
            quacker.quack();
        }
    }
    public void registerObserver(DuckObserver observer) {
            
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
                    
			Quackable duck = (Quackable)iterator.next();
                        //System.out.println("REGISTER"+duck);
			duck.registerObserver(observer);
		}
	} 
    public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	} 
}