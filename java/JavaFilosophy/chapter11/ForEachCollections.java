import java.util.*;
public class ForEachCollections{
    public static void main(String [] args){
        Collection<String> cs=new LinkedList<String>();
        Collections.addAll(cs,"Take a long way home".split(" "));
        for (String s:cs){
            System.out.print("'"+s+"'");
        }
    }
}