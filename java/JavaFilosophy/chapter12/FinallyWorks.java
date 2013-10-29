class ThreeException extends Exception{}

public class FinallyWorks{
    static int count=0;
    public static void main(String[] args){
        while (true){
            try{
                if (count++==0){
                    throw new ThreeException();
                }
                System.out.println("no exception in row. count="+count);
            }
            catch (ThreeException e){
                System.out.println("Three exception");
            }
            finally{
                System.out.println("finally block. count="+count);
                if (count==2) break;//exit
            }
        }
    }
}