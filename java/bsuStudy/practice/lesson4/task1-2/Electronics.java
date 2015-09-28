class Electronics extends Product{
	private int warrantly;
	String producer;
	Electronics (int warrantly,String producer,String name, double price, double discount){
		//product
		setPrice(price);
		setName(name);
		setDiscount(discount);
		//Electronics
		this.producer=producer;
		setWarrantly(warrantly);
	}
	void setWarrantly(int w){
		if (w>=0){
			warrantly=w;
		}
	}
	int getWarrantly(){
		return warrantly;
	}
}