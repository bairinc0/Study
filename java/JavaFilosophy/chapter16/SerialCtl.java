import java.io.*;

public class SerialCtl implements Serializable{
    private String a;
    private transient String b;
    public SerialCtl(String aa,String bb){
        a=aa;
        b=bb;
    }
    public String toString(){
        return "a not trasiend="+a+", b trasiend="+b;        
    }
    private void writeObject(ObjectOutputStream stream) throws IOException{
        stream.defaultWriteObject();
        stream.writeObject(b);
    }
    private void readObject(ObjectInputStream stream)throws IOException,ClassNotFoundException{
        stream.defaultReadObject();
        b=(String)stream.readObject();
    }
    public static void  main(String [] args) throws IOException,ClassNotFoundException{
        SerialCtl sc=new SerialCtl("Test1","Test2");
        System.out.println("Before serialize:"+sc);
        ByteArrayOutputStream buf=new ByteArrayOutputStream();
        ObjectOutputStream o=new ObjectOutputStream(buf);
        o.writeObject(sc);
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
        SerialCtl sc2=(SerialCtl)in.readObject();
        System.out.println("After recovering:"+sc2);
    }
}