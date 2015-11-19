class PizzaUser{
	public static void main(String [] a){
		NYPizzaFactory ny=new NYPizzaFactory();
		PizzaStore nyStore=new PizzaStore(ny);
		nyStore.order("cheese");
		//--------Chicago-------
		PizzaStore chicagoStore=new PizzaStore(new ChicagoPizzaFactory());
		chicagoStore.order("cheese");
	}
}