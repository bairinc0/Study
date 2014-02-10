public class DuckSimulator{
    public static void main(String [] args){
        DuckSimulator simulator=new DuckSimulator();
        AbstractDuckFactory duckFactory=new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck=duckFactory.createMallardDuck();
        Quackable redheadDuck=duckFactory.createRedheadDuck();
        Quackable duckCall=duckFactory.createDuckCall();
        Quackable rubberDuck=duckFactory.createRubberDuck();
        Quackable gooseDuck=duckFactory.createGoose();
        
        Flock flockOfDucks=new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(gooseDuck);
        
        Flock flockOfMallards=new Flock();
        Quackable mallardDuck1=duckFactory.createMallardDuck();
        Quackable mallardDuck2=duckFactory.createMallardDuck();
        Quackable mallardDuck3=duckFactory.createMallardDuck();
        Quackable mallardDuck4=duckFactory.createMallardDuck();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);
        flockOfDucks.add(flockOfMallards);
        Quackologist quackologist=new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        System.out.println("<-------------- Whole simulator ---------------->");
        simulate(flockOfDucks);
        
        System.out.println("Number of Quacks:"+QuackCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}