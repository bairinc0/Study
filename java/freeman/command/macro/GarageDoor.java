public class GarageDoor {
    boolean open=false;
    public GarageDoor(){}
    public void open() {
        if (open){
            System.out.println("Door is already opened");
        }
        else{
            open=true;
            System.out.println("Open the door");
        }
	
    }
    public void close() {
	if (open){
            open=false;
            System.out.println("Close the door!");
        }
        else{
            System.out.println("Door is already closed");
        }
    }
}
