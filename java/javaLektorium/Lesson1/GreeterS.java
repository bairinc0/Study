public class GreeterS{
	private String format;
	public static int count=0;
	public GreeterS(String format){
		this.format=format;
	}
	public void greet(String name){
		System.out.println(this.format+name);
		this.count++;
	}

}