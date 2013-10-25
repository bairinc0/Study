import java.util.*;

public class SetOperations{
    public static void main(String []args){
        Random rand=new Random(47);
        Set<String> set1=new HashSet<String>();
        Collections.addAll(set1,"A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println("set 1 contains H? :"+set1.contains("H"));
        System.out.println("set 1 contains N? :"+set1.contains("N"));
        Set<String> set2=new HashSet<String>();
        Collections.addAll(set2,"H I J K L".split(" "));
        set1.remove("H");
        System.out.println("set 1"+set1);
        System.out.println("set 2 in set1? : "+set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set 2 removed from set1: "+set1);
        Collections.addAll(set1,"X Y Z".split(" "));
        System.out.println("X Y Z added to set 1:"+set1);
    }
}