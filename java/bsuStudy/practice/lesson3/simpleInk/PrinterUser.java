public class PrinterUser{
	public static void main(String [] args){
		Printer p=new Printer();
		Cartrige c=new Cartrige(200,"Defender NP-2041");
		p.insertCartrige(c);
		p.print(1000);
		p.print(10000);
		p.print(100000);
		p.print(100000);
	}
}