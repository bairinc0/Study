import java.util.*;

public class ApplesAndOrangesWithGenerics{
    public static void main(String [] args){
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for (int i=0; i<3;i++){
            apples.add(new Apple());
        }
        
        for (int i=0;i<apples.size();i++){
            //Скомпилирует, но при выполнении поймает Exception
            System.out.println(apples.get(i).id());
        }
        for (Apple c:apples){
            System.out.println(c.id());
        }
    }
}