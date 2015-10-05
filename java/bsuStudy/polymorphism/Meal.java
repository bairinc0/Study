class Meal extends Product{
	protected double calories;
	protected double weight;
	Meal (String name, double price, double discount, double calories,double weight){
		setName(name);
		setPrice(price);
		setDiscount(discount);
		this.calories=calories;
		this.weight=weight;
	}
}