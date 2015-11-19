class SimplePizzaFactory{
	Pizza createPizza(String type){
		Pizza pizza;
		if(type.equals("cheese")){
			pizza=new CheesePizza();
		}		
		else if(type.equals("veggi")){
			pizza=new VeggiPizza();
		}
		else if(type.equals("clam")){
			pizza=new ClamPizza();
		}
		else{
			pizza=new PepperoniPizza();
		}		
		return pizza;
	}
}