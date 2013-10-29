public class Cleanup{
    public static void main(String [] args){
        try{
            InputFile in=new InputFile("Cleanup.java");
            try{
                String s;
                int i=0;
                while((s=in.getLine())!=null){
                    i++;
                }   
                System.out.println("File has "+i+" rows!");
            }
            catch(Exception e){
                System.out.println("Caught Exception!");
                e.printStackTrace(System.out);
            }
            finally{
                in.dispose();
            }
        }
        catch(Exception e){
            System.out.println("Can't construct InputFile!!");
        }
    }
}