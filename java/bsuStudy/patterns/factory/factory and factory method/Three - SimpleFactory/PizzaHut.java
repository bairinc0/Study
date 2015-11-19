class PizzaHut{
	SimplePizzaFactory factory;
	PizzaHut(SimplePizzaFactory factory){
		this.factory=factory;
	}
	Pizza orderPizza(String type){
		Pizza pizza;
		pizza=factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}