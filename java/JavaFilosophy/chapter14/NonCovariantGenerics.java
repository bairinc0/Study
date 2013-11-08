import java.util.*;

public class NonCovariantGenerics{
    //ошибка - несовместимы типы при параметризации
    List<Fruit> flist=new ArrayList<Apple>();
}