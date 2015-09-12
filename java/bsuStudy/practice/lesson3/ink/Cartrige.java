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
		}
	}
	public double test(double volumePrint){
		return (volume-volumePrint)/totalValue*100;
		
	}
	public String toString(){
		return "Name:"+name+" percent"+percent()+"("+volume+","+totalValue+")";
	}
}
