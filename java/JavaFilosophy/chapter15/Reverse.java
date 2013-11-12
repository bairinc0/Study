
import java.util.*;
import net.mindview.util.*;
public class Reverse{
    
    public static void main(String[] args){
        CompType [] a=Generated.array(new CompType[12],CompType.generator());
        System.out.println("a:"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("a:"+Arrays.toString(a));
    }
}