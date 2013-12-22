public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="HouseBlend";
    }
    public double cost(){
        double standard=1.79;        
        return standard*getSize();        
    }
    
}