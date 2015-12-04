public class SimpleRemoteControl{
	Command onSlot;
	Command offSlot;
	public void setOnCommand(Command on){
		onSlot=on;
	}
	public void setOffCommand(Command off){
		offSlot=off;
	}
	public void onButtonPressed(){
		onSlot.execute();
	}
	public void offButtonPressed(){
		offSlot.execute();
	}
}