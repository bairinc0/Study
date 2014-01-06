public class CeilingFan {
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    private int speed;
    private String location;
    public CeilingFan(String location){
        this.location=location;
        speed=OFF;
    }
    public void high(){
        speed=HIGH;
    }
    public void medium(){
        speed=MEDIUM;
    }
    public void low(){
        speed=LOW;
    }
    public void off(){
        speed=OFF;
    }
    public int getSpeed(){
        return speed;
    }
    
    public String toString(){
        String status;
        if (speed!=OFF){
            status="Status:ON speed:"+speed+" location:"+location;
        }
        else{
            status="Status:Off"+ "location:"+location;
        }
        return status;
    }    
}
