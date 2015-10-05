class Milk extends Meal{
	double volume;
	Milk(String name, double price, double discount, double calories,double weight,double volume){
		super(name, price, discount, calories,weight);
		this.volume=volume;
	}	
}