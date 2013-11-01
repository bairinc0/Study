import chapter13.interfacea.*;

class B implements A{
    public void f(){
         System.out.println("Calling f method");
    }
    public void g(){
        System.out.println("Calling g method");
    }
}
public class InterfaceViolation{
    public static void main(String [] args){
        A a=new B();
        a.f();
        //a.g();
        System.out.println(a.getClass().getName());
        if (a instanceof B){
            B b=(B)a;
            b.g();
        }
    }
}