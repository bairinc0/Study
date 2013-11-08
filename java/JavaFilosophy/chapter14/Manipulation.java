class Manipulator <T>{
    private T obj;
    public Manipulator(T t){
        obj=t;
    }
    public void manipulate(){
        obj.f();
    }
}
public class Manipulation{
	public static void main(String [] args){
            HasF hf=new HasF();
            Manipulator <HasF> man=new Manipulator <HasF>();
            man.manipulate();
        }
}