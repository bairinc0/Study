public class NYPizzaStore extends PizzaStore{

    Pizza createPizza(String type){
        Pizza pizza=null;
        System.out.println("Cooking in NY style!!");
        if (type.equals("cheese")){
            pizza=new NYCheesePizza();
        }
        else if (type.equals("pepperoni")){
            pizza=new NYPepperoniPizza();
        }
        else if (type.equals("clam")){
            pizza=new NYClaimPizza();
        }
        else if (type.equals("veggi")){
            pizza=new NYVeggiPizza();
        }
        return pizza;
    }
}