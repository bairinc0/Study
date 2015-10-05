class Electronics extends Product{
	int warrant;
	String producer;
	Electronics (String name, double price, double discount, int warrant,String producer){
		setName(name);
		setPrice(price);
		setDiscount(discount);
		this.warrant=warrant;
		this.producer=producer;
	}
}