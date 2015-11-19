class PizzaUser{
	public static void main(String [] a){
		PizzaStore storeNY=NYPizzaStore();
		Pizza nyStyle=storeNY.orderPizza("cheese");
		PizzaStore storeChicago=ChicagoPizzaStore();
		Pizza chicagoStyle=storeChicago.orderPizza("cheese");
	}
}