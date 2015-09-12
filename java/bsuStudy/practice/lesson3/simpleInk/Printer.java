class Printer{
	private Cartrige cartrige;
	private double inkPerSymbol=0.001;//0.001 грамм на символ
	public void print(int symbolCount){
		System.out.println("Printing symbol count="+symbolCount);
		cartrige.print(symbolCount*inkPerSymbol);
		System.out.println("INK left:"+cartrige.percent());
	}
	public void insertCartrige(Cartrige cartrige){		
		this.cartrige=cartrige;
	}
}