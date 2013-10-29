import java.io.*;
class WrapCheckedException{
    void throwRuntimeException(int type){
        try{
            switch (type){
                case 0:throw new FileNotFoundException();
                case 1:throw new IOException();
                case 2:throw new RuntimeException("Where am I?");
                default:return;
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
class SomeOtherException extends Exception{}

public class TurnOffChecking{
    public static void main(String [] args){
        WrapCheckedException wce=new WrapCheckedException();
        wce.throwRuntimeException(3);
        for (int i=0;i<4;i++){
            try{
                if (i<3){
                    wce.throwRuntimeException(i);
                }
                else{
                    throw new SomeOtherException();
                }
            }
            catch(SomeOtherException e){
                System.out.println("SomeOtherException caught" +e);
            }
            catch(RuntimeException re){
                try{
                    throw re.getCause();
                }
                catch(FileNotFoundException e){
                    System.out.println("FileNotFoundException caught"+e);
                }
                catch(IOException e){
                    System.out.println("IOException caught"+e);
                }
                catch(Throwable e){
                    System.out.println("Throwable caught"+e);
                }
            }
        }
        //-----
        System.out.println("\n------------------------------------------------------\n");
        //throw new Exception();
        try{
            wce.throwRuntimeException(1);
            wce.throwRuntimeException(2);
        }
        catch(Exception e){
            System.out.println("Runtime caught "+e);            
        }
    }
}