public class RemoteControl{
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;
    public RemoteControl(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        Command noCommand=new NoCommand();
        for (int i=0;i<5;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        lastCommand=noCommand;
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPressed(int slot){
        System.out.println("Somebody pressed on button in slot "+slot+"(operation:"+onCommands[slot].getClass().getName()+")");
        onCommands[slot].execute();
        lastCommand=onCommands[slot];
    }
    public void offButtonWasPressed(int slot){
        System.out.println("Somebody pressed off button in slot "+slot+"(operation:"+offCommands[slot].getClass().getName()+")");
        offCommands[slot].execute();
        lastCommand=offCommands[slot];
    }
    public void undoButtonWasPressed(){
        System.out.println("undo operataion:"+lastCommand.getClass().getName());
        lastCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuff=new StringBuffer();
        stringBuff.append("----------------Remote Control------------------\n");
        for (int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot "+i+"]"+onCommands[i].getClass().getName()+" "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
}