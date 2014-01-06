public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.on();
        tv.setChannel(7);
        tv.setVolume(10);
    }
}