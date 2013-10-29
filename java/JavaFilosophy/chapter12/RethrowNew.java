class OneException extends Exception{
    public OneException(String s){
        super(s);
    }
}
class TwoException extends Exception{
    public TwoException(String s){
        super(s);
    }
}
public class RethrowNew{
    public static void f() throws OneException{
        System.out.println("Throw exception from f()");
        throw new OneException("from f()");
    }
        
    public static void main(String [] args){
        try{
            try{
                f();
            }
            catch (OneException e){
                System.out.println("Inner Block:");
                e.printStackTrace(System.out);
                throw new TwoException("From Inner Block");
            }
        }
        catch(TwoException e){
            System.out.println("Outer Block:");
            e.printStackTrace(System.out);
        }
    }
    
}