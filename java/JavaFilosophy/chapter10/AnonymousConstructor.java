abstract class Base{
    public Base(int i){
        System.out.println("base Constructor i="+i);
    }
    public abstract void f();
}
public class AnonymousConstructor{
    public static Base getBase(int i){
        return new Base(i){
            {System.out.println("Initializing");}
            public void f(){
                System.out.println("Unnamed f()");
            }
        };
    }
    public static void main(String [] args){
        Base base=getBase(11);
        base.f();
    }
}