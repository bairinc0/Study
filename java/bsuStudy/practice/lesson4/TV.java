class TV extends Electronics{
	int screen;
	void test(){
		//name="test";
		//discount=12;
	}
	public String toString(){
		return "TV("+getName()+") screen:"+screen+" warrantly:"+warrantly+" producer:"+producer+" price="+getPrice();
	}
}