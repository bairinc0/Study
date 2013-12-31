public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Cheese createCheese(){
        return new Reggiano();
    }
   /* public Veggies[] createVeggies(){
        Veggies veggies[]={
            new Garlic(),
            new Onion(),
            new Mushroom(),
            new RedPepper()
        };
    }*/
  /*public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }*/
    public Clams createClams(){
        return new FreshClams();
    }
}