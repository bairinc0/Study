class CD extends Product{
	double playLength;
	String artitist;
	CD(String name, double price, double discount){
		setName(name);
		setPrice(price);
		this.discount=discount;
	}
}
