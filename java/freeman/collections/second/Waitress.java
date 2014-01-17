import java.util.Iterator;
public class Waitress{
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu,Menu cafeMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
        this.cafeMenu=cafeMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        Iterator cafeIterator=cafeMenu.createIterator();
        System.out.println("BreakFast");        
        printMenu(pancakeIterator);
        System.out.println("----------------------------------------------------------");
        System.out.println("Lunch");
        printMenu(dinerIterator);
        System.out.println("----------------------------------------------------------");
        System.out.println("Dinner");
        printMenu(cafeIterator);
    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item=(MenuItem)iterator.next();
            System.out.print(item.getName()+", ");
            System.out.print(item.getPrice()+", ");
            System.out.print(item.getDescription()+"\n ");
            System.out.println("----------------------------------------------------------");
        }
    }
}