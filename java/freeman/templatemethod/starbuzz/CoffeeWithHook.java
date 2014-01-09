import java.io.*;

public class CoffeeWithHook extends CaffeineBeverage{
    void brew(){
        System.out.println("Add Coffee");
    }
    void addCondiments(){
        System.out.println("Add milk and sugar");
    }
    public boolean customerWantsCondiments(){
        String answer=getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        else{
            return false;
        }
    }
    private String getUserInput(){
        String answer=null;
        System.out.println("Would you like milk and sugar (y/n)?");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            answer=in.readLine();
        }
        catch(IOException ioe){
            System.err.println("IO Exception!");
        }
        if (answer==null){
            answer="n";
        }
        return answer;
    }
}