import java.io.*;
public class Blip3 implements Externalizable{
    private int i;
    private String s;
    public Blip3(){
        System.out.println("Blip3 Constructor!");
    }
    public Blip3(String x,int a){
        System.out.println("Blip3 (String,int)");
        s=x;
        i=a;
    }
    public String toString(){
        return s+i;
    }
    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("Blip3.writeExternal()");
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException{
        System.out.println("Blip3.readExternal()");
        s=(String)in.readObject();
        i=in.readInt();
    }
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        System.out.println("Create Blip3:");
        Blip3 b3=new Blip3("I am string!",47);
        System.out.println(b3);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Blip3.out"));
        System.out.println("Save Blip3:");
        o.writeObject(b3);
        o.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Blip3.out"));
        System.out.println("Get Blip3:");
        b3=(Blip3)in.readObject();
        System.out.println(b3);
    }
}