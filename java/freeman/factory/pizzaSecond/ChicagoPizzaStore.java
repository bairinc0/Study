public class ChicagoPizzaStore extends PizzaStore{
    

    Pizza createPizza(String type){
        Pizza pizza=null;
        System.out.println("Cooking in Chicago style!!");
        if (type.equals("cheese")){
            pizza=new ChicagoCheesePizza();
        }
        else{
            System.out.println("Only cheese Pizza in chicago!!");
        }
        
        return pizza;
    }
}