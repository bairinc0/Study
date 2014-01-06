public class RemoteControl{
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands=new Command[3];
        offCommands=new Command[3];
        Command noCommand=new NoCommand();
        for (int i=0;i<3;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPressed(int slot){
        System.out.println("Somebody pressed on button in slot "+slot);
        onCommands[slot].execute();
    }
    public void offButtonWasPressed(int slot){
        System.out.println("Somebody pressed off button in slot "+slot);
        offCommands[slot].execute();
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