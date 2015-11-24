public class PizzaStore{
    PizzaFactory factory;
    public PizzaStore(PizzaFactory factory){
        this.factory=factory;
    }
    public void setFactory(PizzaFactory factory){
        this.factory=factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public static void main(String [] args){
        PizzaStore store=new PizzaStore(new SimplePizzaFactory());
        Pizza order=store.orderPizza("cheese");
        store.setFactory(new NYPizzaFactory());
        System.out.println("--------------------------------------------------");
        order=store.orderPizza("cheese");
    }
}