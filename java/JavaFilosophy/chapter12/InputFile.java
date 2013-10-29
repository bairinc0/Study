import java.io.*;

public class InputFile{
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try{
            in=new BufferedReader(new FileReader(fname));
        }
        catch(FileNotFoundException e){
            System.out.println("Can't open file:"+fname);
            throw e;
        }
        catch(Exception e){
            try{
                in.close();
            }
            catch(IOException e2){
                System.out.println("in.close() doesn't executed");
            }
            throw e;
        }
        finally{
            //Нельзя закрывать файл тут!
        }
    }
    public String getLine(){
        String s;
        try{
            s=in.readLine();
        }
        catch (IOException e){
            throw new RuntimeException("readLine() doesn't executed");
        }
        return s;
    }
    public void dispose(){
        try{
            in.close();
            System.out.println("dispose is executed");
        }
        catch(IOException e){
            throw new RuntimeException("in.close() doesn't executed");
        }
    }
}