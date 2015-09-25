class Product{
	private String name;
	private double price;	
	protected discount;
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void setPrice(double price){
		if(price>0){
			this.price=price;
		}
	}
	double getPrice(){
		return price*(100-discount)/100;
	}
	void setDiscount(double discount){
		if (discount>0){
			this.discount=discount;
		}
	}
}
/*
Product p=new Product();
p.price=100;
*/