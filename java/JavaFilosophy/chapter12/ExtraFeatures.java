class MyException2 extends Exception{
    private int x;
    public MyException2(){}
    public MyException2(String msg){
        super(msg);
    }
    public MyException2(String msg,int x){
        super(msg);
        this.x=x;
    }
    public int val(){
        return x;
    }
    public String getMessage(){
        return "Exact message:" + x+" "+super.getMessage();
    }
}
public class ExtraFeatures{
    public static void f() throws MyException2{
        System.out.println("Throwing in f()");
        throw new MyException2();
    }
    public static void g() throws MyException2{
        System.out.println("Throwing in g()");
        throw new MyException2("i am g()");
    }
    public static void h() throws MyException2{
        System.out.println("Throwing in h()");
        throw new MyException2("i am h()",47);
    }
    public static void main(String [] args){
        try{
            f();
        }
        catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }
        catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            h();
        }
        catch(MyException2 e){
            e.printStackTrace(System.out);
            System.out.println("e.val="+e.val());
        }
    }
}