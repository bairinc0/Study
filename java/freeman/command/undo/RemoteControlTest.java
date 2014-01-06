public class RemoteControlTest{
    public static void main(String [] args){
        RemoteControl remote=new RemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);
        LightOffCommand lightOff=new LightOffCommand(light);
        GarageDoor door=new GarageDoor();
        OpenDoorCommand doorOpen=new OpenDoorCommand(door);
        CloseDoorCommand doorClose=new CloseDoorCommand(door);
        TV tv=new TV();
        TVOnCommand tvOn=new TVOnCommand(tv);
        TVOffCommand tvOff=new TVOffCommand(tv);
        CeilingFan fan=new CeilingFan("Room");
        CeilingFanHighCommand fanHigh=new CeilingFanHighCommand(fan);
        CeilingFanMediumCommand fanMedium=new CeilingFanMediumCommand(fan);
        CeilingFanLowCommand fanLow=new CeilingFanLowCommand(fan);
        CeilingFanOffCommand fanOff=new CeilingFanOffCommand(fan);
        remote.setCommand(0,doorOpen,doorClose);
        remote.setCommand(1,lightOn,lightOff);
        remote.setCommand(2,tvOn,tvOff);
        remote.setCommand(3,fanLow,fanOff);
        remote.setCommand(4,fanMedium,fanOff);
        //-----------------------------------------------
        System.out.println("Testing of remote Control");
        System.out.println(remote);        
        System.out.println("use remote Control");
        remote.onButtonWasPressed(0);
        System.out.println("Watch TV?");
        System.out.println(tv);
        remote.onButtonWasPressed(2);
        System.out.println("YES Watch TV");
        System.out.println(tv);
        tv.setVolume(15);
        tv.setChannel(10);
        System.out.println(tv);
        remote.offButtonWasPressed(2);
        System.out.println(tv);
        System.out.println("Undo TV operation");
        remote.undoButtonWasPressed();
        System.out.println(tv);
        System.out.println("Test Fan");
        remote.onButtonWasPressed(3);
        System.out.println(fan);
        //fan.high();
        remote.onButtonWasPressed(4);
        System.out.println(fan);        
        remote.undoButtonWasPressed();
        System.out.println(fan);
    }
}