public class GenericMethods{
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }
    public static void main(String [] args){
        GenericMethods gm=new GenericMethods();
        gm.f("I am string!!!");
        gm.f(1);
        gm.f(1.3);
        gm.f(gm);
    }
}