
import java.util.*;
import net.mindview.util.*;

public class AlphabeticSearch{
    
    public static void main(String[] args){
        String [] sa=Generated.array(new String[10],new RandomGenerator.String(5));
        
        Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
        int index=Arrays.binarySearch(sa, sa[5],String.CASE_INSENSITIVE_ORDER);
        System.out.println("index:"+index);
    }
}