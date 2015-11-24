public class TestPizzaStore{
    public static void main(String [] args){
        PizzaStore psNY=new NYPizzaStore();
        PizzaStore psChicago=new ChicagoPizzaStore();
        System.out.println("Start orders");
        System.out.println("--------------------------------------------------");
        Pizza order=psNY.orderPizza("cheese");
        System.out.println("Alex ordered "+order.getName());
        System.out.println();
        System.out.println("--------------------------------------------------");
        order=psChicago.orderPizza("cheese");
        System.out.println("Sam ordered "+order.getName());
        System.out.println();
        System.out.println("--------------------------------------------------");
        order=psNY.orderPizza("veggi");
        System.out.println("Rick ordered "+order.getName());
    }
}