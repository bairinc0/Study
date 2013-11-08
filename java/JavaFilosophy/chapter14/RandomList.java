import java.util.*;

public class RandomList<T>{
    private ArrayList<T> storage=new ArrayList<T>();
    private Random rand=new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
    public int size(){
        return storage.size();
    }
    public static void main(String [] args){
        RandomList<String> rs=new RandomList<String>();
        for (String s:("lla asssa aa asa saa saa s asas").split(" ")){
            rs.add(s);
        }
        for (int i=0;i<rs.size();i++){
            System.out.println(rs.select());
        }
    }
}