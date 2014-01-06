public class RemoteControlTest{
    public static void main(String [] args){
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);
        LightOffCommand lightOff=new LightOffCommand(light);
        System.out.println("Testing of ligths");
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
        System.out.println("------------------------------------------------");
        GarageDoor door=new GarageDoor();
        OpenDoorCommand doorOpen=new OpenDoorCommand(door);
        CloseDoorCommand doorClose=new CloseDoorCommand(door);
        System.out.println("Testing of garage door");
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
        remote.buttonWasPressed();
        remote.setCommand(doorClose);
        remote.buttonWasPressed();
    }
}