import java.util.Iterator;
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegeterian;
    double price;
    public MenuItem(String name,String description,boolean vegeterian,double price){
        this.name=name;
        this.description=description;
        this.vegeterian=vegeterian;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public boolean isVegeterian(){
        return vegeterian;
    }
    public double getPrice(){
        return price;
    }
    public void print(){
        System.out.print(" "+getName());
        if (isVegeterian()){
            System.out.print("(v)");
        }
        System.out.print(", price:"+getPrice());
        System.out.print(", "+getDescription()+"\n");
    }
    public Iterator<Object> createIterator(){
        return new NullIterator();
    }
}