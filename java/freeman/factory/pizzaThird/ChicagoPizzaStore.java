public class ChicagoPizzaStore extends PizzaStore{  
    protected Pizza createPizza(String type){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        }
        else if (type.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam pizza");
        }
        return pizza;
    }
}