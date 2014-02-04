public class SoldState implements State{
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("Please wait while we giving you a gumball");
    }
    public void ejectQuarter(){
        System.out.println("Sorry you already bought gumball");        
    }
    public void turnCrank(){
        System.out.println("Don't break game!");        
    }
    public void dispense(){
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("PANIC WE SOLD ALL BALLS!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}