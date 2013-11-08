abstract class GenericWithCreate<T>{
    final T element;
    GenericWithCreate(){
        element=create();
    }
    abstract T create();
}
class X{}
class Creator extends GenericWithCreate<X>{
    X create(){
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
class Y{
    public void f(){
        System.out.println("I am mister Y");
    }
}
class CreatorY extends GenericWithCreate<Y>{
    Y create(){
        return new Y();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
public class CreatorGeneric{
    public static void main(String [] arg){
        Creator c=new Creator();
        c.f();
        CreatorY cy=new CreatorY();
        cy.f();
        Y y=cy.create();
        y.f();
    }
}