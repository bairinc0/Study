import chapter15.util.*;
import java.util.*;
public class TestArrayGeneration{
    
    public static void main(String[] args){
        int size=6;
        boolean [] a1=ConvertTo.primitive(Generated.array(Boolean.class,new RandomGenerator.Boolean(),size));
        System.out.println("a1:"+Arrays.toString(a1));
        byte [] a2=ConvertTo.primitive(Generated.array(Byte.class,new RandomGenerator.Byte(),size));
        System.out.println("a2:"+Arrays.toString(a2));
        char [] a3=ConvertTo.primitive(Generated.array(Character.class,new RandomGenerator.Character(),size));
        System.out.println("a3:"+Arrays.toString(a3));
        float [] a4=ConvertTo.primitive(Generated.array(Float.class,new RandomGenerator.Float(),size));
        System.out.println("a4:"+Arrays.toString(a4));
    }
}