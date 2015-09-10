public class BoxUser{
	public static void main(String [] args){
		Cat c=new Cat();
		c.age=5;
		c.weight=12;
		c.name="Tom";
		Box b=new Box();
		b.add(c);
		System.out.println(b);
	}
}