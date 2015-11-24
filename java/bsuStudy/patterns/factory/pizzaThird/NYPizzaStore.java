public class NYPizzaStore extends PizzaStore{  
    protected Pizza createPizza(String type){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("new York Cheese Pizza");
        }
        else if (type.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("new york clam pizza");
        }
        return pizza;
    }
}