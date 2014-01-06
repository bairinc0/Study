public class CloseDoorCommand implements Command{
    GarageDoor door;
    public CloseDoorCommand(GarageDoor door){
        this.door=door;
    }
    public void execute(){
        door.close();
    }
}