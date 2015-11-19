class NyPizzaStore extends PizzaStore{
	Pizza createPizza(String type){
		Pizza pizza;
		if(type.equals("cheese")){
			pizza=new NYCheesePizza();
		}		
		else if(type.equals("veggi")){
			pizza=new NYVeggiPizza();
		}
		else if(type.equals("clam")){
			pizza=new NYClamPizza();
		}
		else{
			pizza=new NYPepperoniPizza();
		}		
		return pizza;
	}
}