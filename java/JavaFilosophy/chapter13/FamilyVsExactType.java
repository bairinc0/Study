package chapter13;
class Base{}
class Derived extends Base{}

public class FamilyVsExactType{
    static void test(Object x){
        System.out.println("Testing object of type "+x.getClass());
        System.out.println("X instance of Base? "+(x instanceof Base));
        System.out.println("Base.isInstance(x)? "+(Base.class.isInstance(x)));
        System.out.println("X instance of Derived? "+(x instanceof Derived));
        System.out.println("Derived.isInstance(x)? "+(Derived.class.isInstance(x)));
        System.out.println("x.getClass()==Base.class "+(x.getClass()==Base.class));
        System.out.println("x.getClass()==Derived.class "+(x.getClass()==Derived.class));
        System.out.println("x.getClass().equals(Base.class) "+(x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class) "+(x.getClass().equals(Derived.class)));
        System.out.println("---------------------------------------------------");
    }
    public static void main(String [] args){
        test(new Base());
        test(new Derived());
    }
}