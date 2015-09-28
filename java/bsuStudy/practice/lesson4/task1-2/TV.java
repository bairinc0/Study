class TV extends Electronics{
	private int screen;
	TV(int warrantly,String producer,String name, double price, double discount, int screen){
		//Electronics constructor!
		super(warrantly,producer,name,price, discount);
		//TV
		setScreen(screen);
	}	
	void setScreen(int s){
		if(s>0){
			screen=s;
		}
	}
	public String toString(){
		return "TV("+getName()+") screen:"+screen+" warrantly:"+getWarrantly()+" producer:"+producer+" price="+getPrice();
	}
}