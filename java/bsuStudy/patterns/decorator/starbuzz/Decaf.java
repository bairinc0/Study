public class Decaf extends Beverage{
    public Decaf(){
        description="Decaf";
    }
    public double cost(){
        double cost=beverage.cost();
        if (getSize()==1){
            cost+=0.2;
        }
        else if(getSize()==2){
            cost+=0.15;
        }
        else{//3
            cost+=0.3;
        }
        return cost;
    } 
    
}