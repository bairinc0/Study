class WashingMachine extends Electronics{
	double volume;
	Was(String name, double price, double discount, int warrant,String producer,double volume){
		super(name, price, discount, warrant, producer);
		setVolume(volume);
	}
	public void setVolume(double v){
		if (v>0) volume=v;
	}
	public String getVolume(){
		return volume+" kg";
	}
	public String toString(){
		return "TV("+getName()+") screen:"+getScreen()+" warrantly:"+warrant+" producer:"+producer+" price="+getPrice();
	}
}