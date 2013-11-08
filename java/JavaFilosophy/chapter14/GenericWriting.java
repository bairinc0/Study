import java.util.*;
public class GenericWriting{
    static <T> void writeExact(List <T> list,T item){
        list.add(item);
    }
    static List<Apple> apples=new ArrayList<Apple>();
    static List<Fruit> fruit=new ArrayList<Fruit>();
    static void f1(){
        writeExact(apples,new Apple());
        writeExact(apples,new Jonathan());
        //writeExact(apples,new Fruit());
    }
    static <T> void writeWithWildcards(List <? super T> list,T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildcards(apples,new Apple());
        writeWithWildcards(fruit,new Apple());
    }
    public static void main(String [] a){
        f1();
        f2();
    }
}