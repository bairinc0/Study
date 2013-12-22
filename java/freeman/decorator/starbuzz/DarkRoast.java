public class DarkRoast extends Beverage{
    public DarkRoast(){
        description="DarkRoast";
    }
    public double cost(){
        double standard=0.79;        
        return standard*getSize();
    }
    
}