class NeedCleanup{
    private static long counter=1;
    private final long id=counter++;
    public void dispose(){
        System.out.println("NeedCleanup "+id+" is over");
    }
}
class ConstructionException extends Exception{}
class NeedCleanup2 extends NeedCleanup{
    public NeedCleanup2() throws ConstructionException{}
}
public class CleanupIdiom{
    public static void main(String [] args){
        NeedCleanup nc1=new NeedCleanup();
        try{
            
        }
        finally{
            nc1.dispose();
        }
        NeedCleanup nc2=new NeedCleanup();
        NeedCleanup nc3=new NeedCleanup();
        try{
            
        }
        finally{
            nc3.dispose();
            nc2.dispose();            
        }
        
        try{
            NeedCleanup2 nc4=new NeedCleanup2();
            try{
                NeedCleanup2 nc5=new NeedCleanup2();
                try{
                    
                }
                finally{
                    nc5.dispose();
                }
            }
            catch(ConstructionException e5){
                //nc5 constructor
                System.out.println(e5);
            }
            finally{
                nc4.dispose();
            }
        }
        catch(ConstructionException e4){
                //nc4 constructor
            System.out.println(e4);
        }
    }
}