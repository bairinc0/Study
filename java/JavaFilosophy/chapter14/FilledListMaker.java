import java.util.*;

public class FilledListMaker<T>{
    List <T> create(T t,int n){
        List<T> result=new ArrayList<T>();
        for (int i=0;i<n;i++){
            result.add(t);
        }
        return result;
    }
    public static void main(String [] args){
        FilledListMaker <String> stringMaker =new  FilledListMaker <String>();
        List<String> stringList=stringMaker.create("Hello world",3);
        System.out.println(stringList);
        
    }
}