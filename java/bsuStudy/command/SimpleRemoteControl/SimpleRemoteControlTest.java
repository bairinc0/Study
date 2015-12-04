class SimpleRemoteControlTest{
	public static void main(String [] a){
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light=new Light();
		remote.setOnCommand(new LightOnCommand(light));
		remote.setOffCommand(new LightOffCommand(light));
		remote.onButtonPressed();
		remote.onButtonPressed();
		remote.offButtonPressed();
	}
}