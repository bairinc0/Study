class Cartrige{
	private double totalValue;//максимальное количество чернил
	private double volume;//сколько сейчас чернил
	private String name;//название 
	Cartrige (double totalValue,String name){
		this.totalValue=totalValue;
		volume=totalValue;
		this.name=name;
	}	
	public double percent(){
		return volume/totalValue*100;
	}
	public void print(double volumePrint){
		if (volume-volumePrint>0){	
			volume-=volumePrint;
			System.out.println("PRINTING");
		}
		else{
			System.out.println("NOT ENOUGHT INK");
		}
	}
	public String toString(){
		return "Name:"+name+" percent"+percent()+"("+volume+","+totalValue+")";
	}
}
