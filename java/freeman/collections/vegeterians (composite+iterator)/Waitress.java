import java.util.Iterator;
public class Waitress{
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus=allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
    public void printVeg(){
        Iterator iterator=allMenus.createIterator();
        System.out.println("\n Vegeterian Menu-------------------------");
        while (iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            try{
                if (menuComponent.isVegeterian()){
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e){
                
            }
        }
    }
}