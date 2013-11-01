import java.lang.reflect.*;
class WithPrivateFinalField{
    private int i=1;
    private final String s="I'am safe!!";
    private String s2="I'm so scary";
    public String toString(){
        return "i="+i+", s="+s+", s2="+s2;
    }
}
public class ModifyingPrivateFields {
    public static void main(String []args) throws Exception{
        WithPrivateFinalField pf=new WithPrivateFinalField();
        System.out.println(pf);
        Field f=pf.getClass().getDeclaredField("i");
        f.setAccessible(true);     
        System.out.println("f.getInt(pf)="+f.getInt(pf));
        f.setInt(pf,47);
        System.out.println(pf);
        f=pf.getClass().getDeclaredField("s");
        f.setAccessible(true); 
        System.out.println("f.get(pf)"+f.get(pf));
        f.set(pf,"YOu will die!!");
        System.out.println(pf);
        f=pf.getClass().getDeclaredField("s2");
        f.setAccessible(true); 
        System.out.println("f.get(pf)"+f.get(pf));
        f.set(pf,"OLOLO!!");
        System.out.println(pf);
    }
}