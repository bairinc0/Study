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
        //-- fill arrays
        Command[] partyStart={lightOn,doorOpen,tvOn,fanHigh};
        Command[] partyFinish={lightOff,doorClose,tvOff,fanOff};
        MacroCommand partyStartMacro=new MacroCommand(partyStart);
        MacroCommand partyFinishMacro=new MacroCommand(partyFinish);
        remote.setCommand(0,partyStartMacro,partyFinishMacro);
         //-----------------------------------------------
        System.out.println("Start party");
        remote.onButtonWasPressed(0);
        System.out.println(tv);
        System.out.println(fan);
        
        System.out.println("End party");
        remote.offButtonWasPressed(0);
        System.out.println(tv);
        System.out.println(fan);
        
        System.out.println("Too early!!!");
        remote.undoButtonWasPressed();
        System.out.println(tv);
        System.out.println(fan);
    }
}