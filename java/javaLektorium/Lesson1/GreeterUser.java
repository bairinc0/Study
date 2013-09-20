public class GreeterUser{
	public static void main(String[] args){
		Greeter g=args[0].equals("en")?new Greeter("Hello, "):new Greeter("Nihao, ");
		for (String a:args){
			g.greet(a);
		}
		System.out.println(g.count);
	}
}