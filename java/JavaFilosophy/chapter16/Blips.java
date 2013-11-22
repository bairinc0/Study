import java.io.*;
class Blip1 implements Externalizable{
    public Blip1(){
        System.out.println("Blip 1 constructor");
    }
    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("Blip1.writeExternal()");
    }
    public void readExternal(ObjectInput out) throws IOException,ClassNotFoundException{
        System.out.println("Blip1.readExternal()");
    }
}
class Blip2 implements Externalizable{
    Blip2(){
        System.out.println("Blip 2 constructor");
    }
    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("Blip2.writeExternal()");
    }
    public void readExternal(ObjectInput out) throws IOException,ClassNotFoundException{
        System.out.println("Blip2.readExternal()");
    }
}
public class Blips{
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        System.out.println("Creating objects");
        Blip1 b1=new Blip1();
        Blip2 b2=new Blip2();
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Blips.out"));
        System.out.println("Saving objects");
        o.writeObject(b1);
        o.writeObject(b2);
        o.close();
        
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Blips.out"));
        System.out.println("Ressurecting objects");
        b1=(Blip1)in.readObject();
        //Exception!
        //b2=(Blip2)in.readObject();
    }
}