public class OnOffSwitch{
    private static Switch sw=new Switch();
    static void f() throws OnOffException1, OnOffException2{}
    public static void main(String [] args){
        try{
            sw.on();
            f();
            sw.off();
        }
        catch (OnOffException1 e){
            System.out.println("OnOffException 1");
            sw.off();
        }
        catch (OnOffException2 e){
            System.out.println("OnOffException 2");
            sw.off();
        }
        finally{
            
        }
    }
}