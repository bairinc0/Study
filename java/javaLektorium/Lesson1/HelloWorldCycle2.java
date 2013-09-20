public class HelloWorldCycle2{
	public static void main(String[] args){
		if (args.length>0){
			for (String a:args){
				System.out.println("Hello, "+a+"!");
			}
		}
		else{
			System.out.println("Error! String is not ready!");
		}
	}
}