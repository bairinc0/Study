public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    public abstract String getDescription();
    public int getSize(){
        return beverage.getSize();
    }
}