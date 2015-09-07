public class Farm{
	public static void main(String args[]){		
		Cow c=new Cow();
		Dog d=new Dog();
		c.say();
		d.say();
		//а так не работает
		//Cow c1;
		//c.say();
	}
}
class Cow{
	public void say(){
		System.out.println("Mooo");
	}
}
class Dog{
	public void say(){
		System.out.println("Bow");
	}
}
class Cat{}