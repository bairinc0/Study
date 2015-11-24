import java.util.*;
abstract class Pizza{
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings=new ArrayList<String>();
    void prepare(){
        System.out.println("Prepating "+name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings: ");
        for (int i=0;i<toppings.size();i++){
            System.out.print(" "+toppings.get(i));
        }
        System.out.println();
    }
    void bake(){
        System.out.println("Bake for 25 minutes at 300 C ");
    }
    void cut(){
        System.out.println("cutting into 8 slices");
    }
    void box(){
        System.out.println("Put into PizzaStore box ");
    }
    public String getName(){
        return name;
    }
}