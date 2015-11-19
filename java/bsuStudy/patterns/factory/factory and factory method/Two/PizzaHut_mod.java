class PizzaHut{
	Pizza orderPizza(String type){
		Pizza pizza;
		if(type.equals("cheese")){
			pizza=new CheesePizza();
		}
		/* 
1. Мы решили убрать из ассортимента куриную пиццу
		else if (type.equals("chicken"){
			pizza=new ChickenPizza();
		}*/
//Добавим два новых вида пиццы: с устрицами и вегетарианскую		
		else if(type.equals("veggi")){
			pizza=new VeggiPizza();
		}
		else if(type.equals("clam")){
			pizza=new ClamPizza();
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