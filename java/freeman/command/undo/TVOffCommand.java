public class TVOffCommand implements Command{
    TV tv;
    public TVOffCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.off();        
    }
    public void undo(){
        tv.on();
        tv.setChannel(7);
        tv.setVolume(10);
    }
}