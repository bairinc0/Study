import java.lang.reflect.*;

class MethodSelector implements InvocationHandler{
    private Object proxied;
    public MethodSelector(Object proxied){
        this.proxied=proxied;
    }
    public Object invoke (Object proxy,Method method,Object [] args) throws Throwable{
        if (method.getName().equals("intresting")){
            System.out.println("---------------------------------");
            System.out.println("Proxy found cool method!!");
        }
        return method.invoke(proxied,args);
    }
}
interface SomeMethods{
    void boring1();
    void boring2();
    void intresting(String args);
    void boring3();
}
class Implementation implements SomeMethods{
    public void boring1(){
        System.out.println("boring1");
    }
    public void boring2(){
        System.out.println("boring2");
    }
    public void intresting(String args){
        System.out.println("intresting "+args);
    }
    public void boring3(){
        System.out.println("boring3");
    }    
}
class SelectingMethods{
    public static void main(String [] args){
        SomeMethods proxy=(SomeMethods)Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class}, new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.boring3();
        proxy.intresting("COW COW!");
    }
}