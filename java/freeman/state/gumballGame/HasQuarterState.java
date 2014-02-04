import java.util.*;
public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    Random randomWinner=new Random(System.currentTimeMillis());
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    public void insertQuarter(){
        System.out.println("Quarter already inserted");
    }
    public void ejectQuarter(){
        System.out.println("Return quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank(){
        System.out.println("You turned....");
        int winner=randomWinner.nextInt(10);
        if ((winner==0)&&(gumballMachine.getCount()>1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
}