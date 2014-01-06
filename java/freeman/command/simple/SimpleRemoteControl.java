public class SimpleRemoteControl{
    Command slot;
    public SimpleRemoteControl(){}
    public void setCommand(Command command){
        slot=command;
    }
    public void buttonWasPressed(){
        System.out.println("Somebody pressed button!");
        slot.execute();
    }
}