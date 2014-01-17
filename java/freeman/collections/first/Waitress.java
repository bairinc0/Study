public class Waitress{
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        System.out.println("BreakFast");        
        printMenu(pancakeIterator);
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Lunch");
        printMenu(dinerIterator);
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