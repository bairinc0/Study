public class BigBoxUser{
	public static void main(String [] args){
		Cat c1=new Cat();
		c1.age=5;
		c1.weight=12;
		c1.name="Tom";
		Cat c2=new Cat();
		c2.age=4;
		c2.weight=3;
		c2.name="Jerry";
		Cat c3=new Cat();
		c3.age=1;
		c3.weight=1;
		c3.name="Milky";
		Cat c4=new Cat();
		c4.age=3;
		c4.weight=2;
		c4.name="Vasiliy";
		Cat c5=new Cat();
		c5.age=3;
		c5.weight=2;
		c5.name="Rocky";
		BigBox b=new BigBox();
		System.out.println("-------------------------Adding cats!-------------------------");
		b.add(c1);
		b.add(c2);
		b.add(c3);
		b.add(c4);
		b.add(c5);		
		System.out.println("-------------------------Show box!-------------------------");
		System.out.println(b);
	}
}