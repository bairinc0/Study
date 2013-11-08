import java.util.*;
public class UnboundedWildcards2{
    static Map map1;
    static Map<?,?> map2;
    static Map<String,?> map3;
    static void assign1(Map map){
        map1=map;
    }
    static void assign2(Map<?,?> map){
        map2=map;
    }
    static void assign3(Map<String,?> map){
        map3=map;
    }
    public static void main(String [] a){
        assign1(new HashMap());
       
        assign1(new HashMap<String,Integer>());
        assign2(new HashMap<Integer,Double>());
        assign3(new HashMap<String,Integer>());
        //assign3(new HashMap<Integer,Double>());
    }
}