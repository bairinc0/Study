public class TestDrive{
    public static void main(String [] args){
        PancakeHouseMenu pancake=new PancakeHouseMenu();
        DinerMenu diner=new DinerMenu();
        
        Waitress waitress=new Waitress(pancake,diner);
        waitress.printMenu();
    }
}