package chapter8;
class Characteristic{
    private String s;
    Characteristic (String s){
        this.s=s;
        System.out.println("Create Characteristic - "+s);
    }
    protected void dispose(){
        System.out.println("Finalize Characteristic - "+s);
    }
}
class Description{
    private String s;
    Description (String s){
        this.s=s;
        System.out.println("Create Description - "+s);
    }
    protected void dispose(){
        System.out.println("Finalize Description - "+s);
    }
}
class LeavingCreature{
    private Characteristic p=new Characteristic("Tauren");
    private Description d=new Description("Smart cow");
    LeavingCreature(){
        System.out.println("Create Leaving creature");
    }
    protected void dispose(){
        System.out.println("Finalize Leaving creature ");
        d.dispose();
        p.dispose();        
    }
}
class Animal extends LeavingCreature{
    private Characteristic p=new Characteristic("Not tauren");
    private Description d=new Description("No so Smart as cow");
    Animal(){
        System.out.println("Create Animal");
    }
     protected void dispose(){
        System.out.println("Finalize Animal ");
        d.dispose();
        p.dispose();        
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p=new Characteristic("can live in water");
    private Description d=new Description("water and earth");
    Amphibian(){
        System.out.println("Create Amphibian");
    }
     protected void dispose(){
        System.out.println("Finalize Amphibian");
        d.dispose();
        p.dispose();        
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p=new Characteristic("Quak");
    private Description d=new Description("eat bugs");
    Frog(){
        System.out.println("Create Frog");
    }
     protected void dispose(){
        System.out.println("Finalize Frog");
        d.dispose();
        p.dispose();        
        super.dispose();
    }
    public static void main(String [] args){
        Frog frog=new Frog();
        System.out.println("Goodbye!!");
        frog.dispose();
    }
}