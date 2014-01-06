public class OpenDoorCommand implements Command{
    GarageDoor door;
    public OpenDoorCommand(GarageDoor door){
        this.door=door;
    }
    public void execute(){
        door.open();
    }
}