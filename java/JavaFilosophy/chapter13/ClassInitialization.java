import java.util.*;

class Initable{
    static final int staticFinal=47;
    static final int staticFinal2=ClassInitialization.rand.nextInt(1000);
    static{
        System.out.println("Initializing Initable!!");
    }
}

class Initable2{
    static int staticNonFinal=147;
    
    static{
        System.out.println("Initializing Initable2!!");
    }
}
class Initable3{
    static int staticNonFinal=74;
    
    static{
        System.out.println("Initializing Initable3!!");
    }
}
public class ClassInitialization{
    public static Random rand=new Random(47);
    public static void main(String [] args) throws Exception{
        Class iniable=Initable.class;
        System.out.println("Link Initable is created");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        Class iniable3=Class.forName("Initable3");
        System.out.println("Link Initable3 is created");
        System.out.println(Initable3.staticNonFinal);
    }
}