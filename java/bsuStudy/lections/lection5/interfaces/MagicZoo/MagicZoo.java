public class MagicZoo{
	static void whoCanRun(Runner runAble){
		runAble.run();
	}
	static void whoCanFly(Flyer flyAble){
		flyAble.fly();
	}
	public static void main(String [] a){
		Horse h=new Horse();
		Bird b=new Bird();
		Pegasus p=new Pegasus();
		Plane plane=new Plane();
		System.out.println("Horse can run!");
		whoCanRun(h);
		System.out.println("Bird can fly!");
		whoCanFly(b);
		System.out.println("Pegasus can fly and run!");
		whoCanRun(p);
		whoCanFly(p);
		System.out.println("Plane also can fly");
		whoCanFly(plane);
	}	
}