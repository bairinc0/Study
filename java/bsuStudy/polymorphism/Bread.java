class Bread extends Meal{
	String type;
	Bread(String name, double price, double discount, double calories,double weight,String type){
		super(name, price, discount, calories,weight);
		this.type=type;
	}	
}