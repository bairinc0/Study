
import java.util.*;
import net.mindview.util.*;

public class ArraySearching{
    
    public static void main(String[] args){
        Generator<Integer> gen=new RandomGenerator.Integer(1000);
        int []a=ConvertTo.primitive(Generated.array(new Integer[25],gen));
        Arrays.sort(a);
        System.out.println("a:"+Arrays.toString(a));
        int i=0;
        while (true){
            int r=gen.next();
            int location=Arrays.binarySearch(a, r);
            if (location>=0){
                System.out.println("value "+r+" are in position:"+location+" "+a[location]);
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}