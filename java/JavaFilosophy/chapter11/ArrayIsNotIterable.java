import java.util.*;
public class ArrayIsNotIterable{
    static <T> void test(Iterable<T> ib){
        for(T t:ib){
            System.out.print(t+" ");
        }
    }
    public static void main(String [] args){
        test(Arrays.asList(1,2,3));//явное преобразование к списку
        String[] str={"a","b","c"};
        //не сработает - массив не поддерживает Iterable
        //test(str);
        //надо явно преобразовать к типу, который поддерживает
        test(Arrays.asList(str));
    }
}