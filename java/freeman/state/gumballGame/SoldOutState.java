public class SoldOutState implements State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("There is no balls here");
    }
    public void ejectQuarter(){
        System.out.println("Sorry you already bought gumball");        
    }
    public void turnCrank(){
        System.out.println("Don't break game! We can't give you a ball");        
    }
    public void dispense(){
        System.out.println("Don't break game! We can't give you a ball");
    }
}