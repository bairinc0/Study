/*
 � ������ ������ �������� Composing ������������ ���� � ��� �� ������ Shared
 * ��� ����������� �� �� ����� ������� ����� ������ Shared - ����� ��������,
 * ��� �� "���������" ��� ��� ��������� � ������� Composing
 * ��� ����� ������������ ������� refcount
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
        Shared s=new Shared();//����� ������ Shared
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
         s.addRef();//����� ������������ �������� ������ � �� �� ����� �������!
         s.dispose();
    }
}