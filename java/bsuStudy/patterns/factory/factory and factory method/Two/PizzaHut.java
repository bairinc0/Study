class PizzaHut{
	Pizza orderPizza(String type){
		Pizza pizza;
		if(type.equals("cheese")){
			pizza=new CheesePizza();
		}
		else if (type.equals("chicken"){
			pizza=new ChickenPizza();
		}
		else{
			pizza=new PepperoniPizza();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}