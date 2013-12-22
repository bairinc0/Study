public class Mocha extends CondimentDecorator{
    
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Mocha";
    }
    public double cost(){
        double cost=beverage.cost();
        if (getSize()==1){
            cost+=0.4;
        }
        else if(getSize()==2){
            cost+=0.5;
        }
        else{//3
            cost+=0.5;
        }
        return cost;
    }  
}