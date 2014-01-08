public class Test{
    public static void main(String [] args){
        MallardDuck duck=new MallardDuck();
        WildTurkey wild=new WildTurkey();
        Duck adaptedTurkey=new TurkeyAdapter(wild);
        System.out.println("Duck says:");
        duckInfo(duck);
        System.out.println("Adapted Duck says:");
        duckInfo(adaptedTurkey);
        System.out.println("Turkey says:");
        turkeyInfo(wild);
        Turkey duckAdapter=new DuckAdapter(duck);
        System.out.println("Adapted Turkey says:");
        turkeyInfo(duckAdapter);
    }
    static void duckInfo(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void turkeyInfo(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}