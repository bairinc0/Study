public class GreeterUserS{
	public static void main(String[] args){
		for (int i=0;i<10;i++){
			Greeter g=args[0].equals("en")?new Greeter("Hello, "):new Greeter("Nihao, ");
			for (String a:args){
				g.greet(a);
			}
			System.out.println(g.count);
			GreeterS g2=args[0].equals("en")?new GreeterS("Hello, "):new GreeterS("Nihao, ");
			for (String a:args){
				g2.greet(a);
			}
			System.out.println(GreeterS.count);
		}
	}
}