import chapter14.util.*;
import chapter13.pets.*;
import java.util.*;

public class ExplicitTypeSpecification{
    static void f(Map<Person, List <Pet>> petPeople){
        
    }
    public static void main(String [] args){
        //f(New.map()); // -ошибка компиляции вычисление типа аргумента параметризации работает ТОЛЬКО при присваивании!!
        f(New.<Person,List<Pet>>map());
    }
}