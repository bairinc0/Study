public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Soy";
    }
    public double cost(){
        double cost=beverage.cost();
        if (getSize()==1){
            cost+=0.2;
        }
        else if(getSize()==2){
            cost+=0.3;
        }
        else{//3
            cost+=0.5;
        }
        return cost;
    }   
}