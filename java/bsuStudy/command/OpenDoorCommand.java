public class OpenDoorCommand extends Command{
	Door door;
	public OpenDoorCommand(){
		door=new Door();
	}
	public void doExecute(){
		door.open();
	}
}