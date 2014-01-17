public class TestDrive{
    public static void main(String [] args){
        MenuComponent pancake=new Menu("Pancake menu","Breakfast");
        MenuComponent diner=new Menu("Diner menu","Lunch");
        MenuComponent cafe=new Menu("Cafe menu","dinner");
        MenuComponent dessert=new Menu("Dessert menu","Tasty!");
        MenuComponent allMenus=new Menu("All Menus","Combined Menu");
        allMenus.add(pancake);
        allMenus.add(diner);
        allMenus.add(cafe);
        diner.add(new MenuItem("Pasta","Spagetti with sauce",true,150));
        diner.add(dessert);
        dessert.add(new MenuItem("Apple pie","Apple pie with apples",true,70));
        
        Waitress waitress=new Waitress(allMenus);
        pancake.add(new MenuItem("meat Soup","Meat soup from cows",false,200));
        
        cafe.add(new MenuItem("Egg","raw egg",false,50));
        waitress.printMenu();
    }
}