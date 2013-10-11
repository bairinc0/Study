import java.nio.*;
import java.util.*;
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
    private int count;
    public AdaptedRandomDoubles(int count){
        this.count=count;
    }
    public void say(){
        System.out.println(count);
    }
    public int read (CharBuffer cb){
        if (count--==0){
            return -1;
        }
        //System.out.println("inner call ="+count);
        String result=Double.toString(next())+" ";
        cb.append(result);
        //System.out.println("inner length ="+cb);
        return result.length();
    }
    public static void main(String [] args){
        Scanner s=new Scanner(new AdaptedRandomDoubles(1));
        int i=0;
        while (s.hasNextDouble()){
            i++;
            System.out.print(s.nextDouble()+" ");
        }
        AdaptedRandomDoubles d=new AdaptedRandomDoubles(8);
        //d.say();
        //System.out.println(d.next());
        //System.out.println(i);
    }
}