class SimpleException extends Exception{}

public class InheritingExceptions{
    public void f() throws SimpleException{
        System.out.println("Throwing SimpleException from f() method");
        throw new SimpleException();
    }
    public static void main(String [] args){
        InheritingExceptions sed=new InheritingExceptions();
        try{
            sed.f();
        }
        catch (SimpleException e){
            System.out.println("Exception was caught!!");
        }
    }
}