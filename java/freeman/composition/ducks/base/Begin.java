abstract class Duck{
    public void quack(){
        System.out.println("Quack!");        
    }
    public void swim(){
        System.out.println("Swimming!");        
    }
    public void fly(){
        System.out.println("I can fly!");        
    }
    public abstract void display();
}
class MallardDuck extends Duck{
    public void display(){
        System.out.println("I'm Mallard!");        
    }
}
class RedHeadDuck extends Duck{
    public void display(){
        System.out.println("I'm RedHead!");        
    }
}
class RubberDuck extends Duck{
    public void display(){
        System.out.println("I'm rubber duck!");        
    }
	public void quack(){ 
		///
    } 
	public void fly(){        
    }      
}
class DecoyDuck extends Duck{
	public void display(){
        System.out.println("I'm best hunter friend!");        
    }
    public void fly(){        
    }
    public void quack(){ 
		///
    }    
}
public class Begin{
    public static void test(Duck d){
        d.quack();
        d.swim();
        d.display();
        d.fly();
        System.out.println("________________________________________");        
    }
    public static void main(String[] a){
        Duck red=new RedHeadDuck();
        Duck mall=new MallardDuck();    
        Duck rubber=new RubberDuck();
        test(red);
        test(mall);
        test(rubber);
    }
}