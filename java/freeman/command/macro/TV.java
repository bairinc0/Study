public class TV {
    boolean on;
    int volume;
    int channel;
    public TV(){
        volume=0;
        on=false;
        channel=0;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public void setChannel(int channel){
        this.channel=channel;
    }
    public void on() {
        if (on){
            System.out.println("TV is already works");
        }
        else{
            on=true;
            System.out.println("On tv!");
        }
	
    }
    public void off() {
	if (on){
            on=false;
            System.out.println("Switch off TV");
        }
        else{
            System.out.println("TV is not working");
        }
    }
    public String toString(){
        String status;
        if (on){
           status="TV status:on. Volume="+volume+" current channel="+channel;
        }
        else{
           status="TV status:off";
        }
        return status;
    }
}
