public class NeverCaught{
    static void f(){//Спецификация исключения в методе НЕ НУЖНА!!!
        throw new RuntimeException("from f()");
    }
    static void g(){
        f();
    }
    public static void main(String [] args){
        System.out.println("Never Caught");
        g();
    }
}