/*
 В разных разных объектах Composing используется один и тот же объект Shared
 * При финализации мы не можем удалить сразу объект Shared - нужно убедится,
 * что мы "почистили" все его вхождения в объекты Composing
 * для этого используется счётчик refcount
 */
class Shared{
    private int refcount=0;
    private static long counter=0;
    private final long id=counter++;
    public Shared(){
        System.out.println("Create "+this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose(){
        if (--refcount==0){
            System.out.println("Dispose  "+this);
        }
    }
    public String toString(){
        return "Shared "+id;
    }
}
class Composing{
    private Shared shared;
    private static long counter=0;
    private final long id=counter++;
    public Composing(Shared shared){
         System.out.println("Create "+this);
         this.shared=shared;
         this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("Dispose  "+this);
        shared.dispose();
    }
    public String toString(){
        return "Composing "+id;
    }
}
public class ReferenceCounting{
    public static void main(String[] args){
        Shared s=new Shared();//левый объект Shared
        Shared shared=new Shared();       
        Composing[] composing={
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };
        System.out.println("END!!!");
        for (Composing c:composing){
            c.dispose();
        }
         System.out.println("Now delete another object");
         s.addRef();//нужно исскуственно добавить ссылку а то не будет удалять!
         s.dispose();
    }
}