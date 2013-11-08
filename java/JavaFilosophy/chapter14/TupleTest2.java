import static chapter14.util.Tuple.*;
import chapter14.util.*;

public class TupleTest2{
    static TwoTuple<String,Integer> f(){
        return new Tuple.tuple("hi",47);
    }
    static TwoTuple f2(){
        return new Tuple.tuple("hi",47);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return new Tuple.tuple(new Amphibian(),"hi",47);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new Tuple.tuple(new Vehicle(),new Amphibian(),"hi",47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new Tuple.tuple(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }
    public static void main(String []args){
        TwoTuple <String,Integer>ttsi=f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}