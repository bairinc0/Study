public class Whip extends CondimentDecorator{
    
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Whip";
    }

    public double cost(){
        double cost=beverage.cost();
        if (getSize()==1){
            cost+=0.1;
        }
        else if(getSize()==2){
            cost+=0.15;
        }
        else{//3
            cost+=0.4;
        }
        return cost;
    }    
}