import java.util.*;
import java.util.Iterator;
public class Menu extends MenuComponent{
    String name;
    String description;
    ArrayList menuComponents=new ArrayList();
    Iterator iterator=null;
    public Menu(String name,String description){
        this.name=name;
        this.description=description;
       
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }
    public void print(){
        System.out.print("\n "+getName());        
        System.out.println(", "+getDescription());
        System.out.println("---------------------------------------------------");
        Iterator iterator=menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    public Iterator createIterator(){
        if (iterator==null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}