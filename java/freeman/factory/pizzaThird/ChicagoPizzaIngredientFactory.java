public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThickCrustDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Cheese createCheese(){
        return new Mozarella();
    }
   /*public Veggies[] createVeggies(){
        Veggies veggies[]={
            new Spinach(),
            new EggPlant(),
            new BlackOlives()
        };
    }
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }*/
    public Clams createClams(){
        return new FrozenClams();
    }
}