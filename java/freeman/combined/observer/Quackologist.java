public class Quackologist implements DuckObserver{
    public void update(QuackObservable duck){
        System.out.println("Messenger:"+duck+" just quacked");
    }
}