class TV extends Electronics{
	private int screen;
	TV(String name, double price, double discount, int warrant,String producer,int screen){
		super(name, price, discount, warrant, producer);
		setScreen(screen);
	}
	public void setScreen(int s){
		if (s>0) screen=s;
	}
	public String getScreen(){
		return screen+"'";
	}
	public String toString(){
		return "TV("+getName()+") screen:"+getScreen()+" warrantly:"+warrant+" producer:"+producer+" price="+getPrice();
	}
}