public class DuckFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck(){
        return new MallardDuck();
    }
    public Quackable createRedheadDuck(){
        return new ReadheadDuck();
    }
    public Quackable createDuckCall(){
        return new DuckCall();
    }
    public Quackable createRubberDuck(){
        return new RubberDuck();
    }
}