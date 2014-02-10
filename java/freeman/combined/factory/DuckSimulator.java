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
        System.out.println("<-------------- Duck Simulator ---------------->");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("Number of Quacks:"+QuackCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}