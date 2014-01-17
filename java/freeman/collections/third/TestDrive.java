import java.util.*;
public class TestDrive{
    public static void main(String [] args){
        ArrayList <Menu> menus=new ArrayList<Menu>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());
        Waitress waitress=new Waitress(menus);
        waitress.printMenu();
    }
}