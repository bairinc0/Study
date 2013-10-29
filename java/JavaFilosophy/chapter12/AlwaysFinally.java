class FourException extends Exception{}

public class AlwaysFinally{
    public static void main(String [] args){
        System.out.println("Enter to first try level");
        try{
            System.out.println("Enter to second try level");
            try{
                throw new FourException();
            }
            
            finally{
                System.out.println("finally in second try level");
            }
            
        }
        catch(FourException e){
                System.out.println("caught exception in first level!");
        }
        finally{
             System.out.println("finally in first try level");
        }
    }
}