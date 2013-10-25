import java.util.*;

class Snow{
    public String toString(){
        return "Show";
    }
}
class Powder extends Snow{
    public String toString(){
        return "Powder";
    }    
}
class Light extends Powder{
    public String toString(){
        return "Light";
    }
}
class Heavy extends Powder{
    public String toString(){
        return "Heavy";
    }
}
class Crusty extends Snow{
    public String toString(){
        return "Crusty";
    }
}
class Slush extends Snow{
    public String toString(){
        return "Slush";
    }
}

public class AsListInference{
    public static void main(String [] args){
        List<Snow> snow1=Arrays.asList(new Crusty(),new Slush(),new Powder());
        System.out.println("First Array:");
        for (Snow s:snow1){
            System.out.print(s+" ");
        }
        //Ниже выдаст ошибку
        //List <Snow> snow2=Arrays.asList(new Light(),new Heavy());
        List <Snow> snow3=new ArrayList <Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());
        System.out.println("\nSecond Array:");
        for (Snow s:snow3){
            System.out.print(s+" ");
        }
        //подсказали компилятору с каким объектом мы на самом деле работаем!
        List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
        System.out.println("\nThird Array:");
        for (Snow s:snow4){
            System.out.print(s+" ");
        }
    }
}