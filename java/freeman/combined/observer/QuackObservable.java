public interface QuackObservable{
    public void registerObserver(DuckObserver observer);
    public void notifyObservers();
}