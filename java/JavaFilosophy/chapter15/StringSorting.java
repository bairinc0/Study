
import java.util.*;
import net.mindview.util.*;

public class StringSorting{
    
    public static void main(String[] args){
        String [] sa=Generated.array(new String[10],new RandomGenerator.String(5));
        System.out.println("sa:"+Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println("sa:"+Arrays.toString(sa));
        Arrays.sort(sa,Collections.reverseOrder());
        System.out.println("sa:"+Arrays.toString(sa));
        Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
        System.out.println("sa:"+Arrays.toString(sa));
    }
}