interface A{}
interface B{}
class X implements A,B{}
class Y implements A{
    B makeB(){
        return new B(){};
    }
}
public class MultiInterfaces{
    static void takesA(A a){
         System.out.println("Take A");
    }
    static void takesB(B b){
         System.out.println("Take B");
    }
    public static void main(String [] args){
        X x=new X();
        Y y=new Y();
        takesA(x);
        takesA(y);
        takesB (x);
        takesB(y.makeB());
                
    }
    
}