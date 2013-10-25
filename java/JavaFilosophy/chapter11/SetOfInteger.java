import java.util.*;

public class SetOfInteger{
    public static void main(String []args){
        Random rand=new Random(47);
        Set <Integer> intset=new HashSet<Integer>();
        for (int i=0;i<10000;i++){
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
        System.out.println("Sorted:");
        Set <Integer> sortset=new TreeSet<Integer>();
        for (int i=0;i<10000;i++){
            sortset.add(rand.nextInt(30));
        }
        System.out.println(sortset);
    }
}