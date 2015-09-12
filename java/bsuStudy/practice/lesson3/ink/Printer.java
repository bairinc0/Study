class Printer{
	private Cartrige cartrige;
	private double inkPerSymbol=0.001;//0.001 грамм на символ
	public void print(int symbolCount){
		System.out.println("Printing symbol count="+symbolCount);		
		if (cartrige.test(symbolCount*inkPerSymbol)>5){
			cartrige.print(symbolCount*inkPerSymbol);
			System.out.println("Printing");
		}
		else if (cartrige.test(symbolCount*inkPerSymbol)>1){
			cartrige.print(symbolCount*inkPerSymbol);
			System.out.println("Warning ink level too low");
			System.out.println("Printing");
		}
		else{
			System.out.println("Not enought ink");
		}
		System.out.println("INK left:"+cartrige.percent());
	}
	public void insertCartrige(Cartrige cartrige){		
		this.cartrige=cartrige;
	}
}