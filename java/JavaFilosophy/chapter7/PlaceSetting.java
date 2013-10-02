class Plate{
    Plate (int i){
        System.out.println("Plate Constructor");
    }
}
class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate Constructor");
    }
}
class Utensil{
    Utensil(int i){
        System.out.println("Utensil Constructor");
    }
}
class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon Constructor");
    }
}
class Fork extends Utensil{
    Fork(int i){
        super(i);
        System.out.println("Fork Constructor");
    }
}
class Knife extends Utensil{
     Knife(int i){
        super(i);
        System.out.println("Knife Constructor");
    }  
}
class Custom{
    Custom(int i){
        System.out.println("Custom Constructor");
    }
}
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i){
        super(i+1);
        sp=new Spoon(i+2);
        frk=new Fork(i+3);
        kn=new Knife(i+4);
        pl=new DinnerPlate(i+5);
        System.out.println("PlaceSettings constructor");
    }
    public static void main(String [] args){
        PlaceSetting x=new PlaceSetting(0);
    }
}