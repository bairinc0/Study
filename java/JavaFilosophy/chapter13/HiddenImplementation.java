import chapter13.interfacea.*;
import chapter13.packageaccess.*;
import java.lang.reflect.*;

public class HiddenImplementation{
    public static void main(String [] args) throws Exception{
        A a=HiddenC.makeA();
        a.f();
       
        System.out.println(a.getClass().getName());
        /*if (a instanceof C){
            C b=(C)a;
            b.g();
        }*/
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }
    static void callHiddenMethod (Object a,String methodName)throws Exception{
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}