public class SimplePizzaFactory implements PizzaFactory{
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if (type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if (type.equals("pepperoni")){
            pizza=new PepperoniPizza();
        }
        else if (type.equals("clam")){
            pizza=new ClaimPizza();
        }
        else if (type.equals("veggi")){
            pizza=new VeggiPizza();
        }
        return pizza;
    }
}