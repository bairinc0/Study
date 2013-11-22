import java.util.concurrent.*;
import java.io.*;
import java.util.*;

public class Logon implements Serializable{
    private Date date=new Date();
    private String username;
    private transient String password;
    public Logon(String name,String pswd){
        username=name;
        password=pswd;
    }
    public String toString(){
        return "Session info: user="+username+", password="+password+" time="+date;
        
    }
    public static void  main(String [] args) throws Exception{
        Logon a=new Logon("MadCow","CowWins");
        System.out.println(a);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();
        TimeUnit.SECONDS.sleep(1);
        
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println("Recovering object at:"+new Date());
        a=(Logon)in.readObject();
        System.out.println(a);
    }
}