public class TestStore{
    public static void main(String[] args){
        System.out.println("Itan makes order:");
        PizzaStore nyPizzaStore=new NYPizzaStore();
        Pizza myOrder;
        myOrder=nyPizzaStore.orderPizza("cheese");
        System.out.println(myOrder);
        System.out.println();
        System.out.println("Mike makes order:");
        PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();
        myOrder=chicagoPizzaStore.orderPizza("clam");
        System.out.println(myOrder);
    }
}