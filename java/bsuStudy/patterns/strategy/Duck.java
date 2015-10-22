abstract class Duck{
	FlyBehaviour f;
	void swim(){
		System.out.println("I can swim");		
	}
	void performFly(){
		f.fly();
	}
	abstract void display();
}