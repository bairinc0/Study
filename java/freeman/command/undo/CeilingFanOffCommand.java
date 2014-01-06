public class CeilingFanOffCommand implements Command{
    CeilingFan fan;
    int prevSpeed;
    public CeilingFanOffCommand(CeilingFan fan){
        this.fan=fan;
    }
    public void execute(){
        prevSpeed=fan.getSpeed();
        fan.off();
    }
    public void undo(){
        if (prevSpeed==CeilingFan.HIGH){
            fan.high();
        }
        else if(prevSpeed==CeilingFan.MEDIUM){
            fan.medium();
        }
        else if(prevSpeed==CeilingFan.LOW){
            fan.low();
        }
        else{
            fan.off();
        }
    }
}
