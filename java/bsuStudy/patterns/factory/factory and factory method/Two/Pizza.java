abstract class Pizza{
	double price;
	void prepare(){
		System.out.println("preparing pizza base");
		System.out.println("adding components");
	}
	void bake(){
		System.out.println("Fire up!!");
	}
	void cut(){
		System.out.println("Slice");
	}
	void box(){
		System.out.println("Put into box");
	}
}