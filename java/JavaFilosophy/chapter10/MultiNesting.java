class MNA{
    private void f(){
        System.out.println("f()");
    }
    class A{
        private void g(){  
            System.out.println("g()");
        }
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
public class MultiNesting{
    public static void main(String [] agrs){
        MNA mna=new MNA();
        MNA.A mnaa=mna.new A();
        MNA.A.B mnaab=mnaa.new B();
        //mnaa.g();
        mnaab.h();
    }
    
}