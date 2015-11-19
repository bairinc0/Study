abstract class Pizza{
	String name;
	String dough;
	String sauce;
	ArrayList toppings=new ArrayList();
	void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough:"+dough);
		System.out.println("Adding toppings:");
		for (int i=0;i<toppings.size();i++){
			System.out.print(" "+toppings.get(i));
		}
		System.out.println("Adding sauce:"+sauce);
	}
	void bake(){
		System.out.println("Bake for 25 minutes at 300 C");		
	}
	void cut(){
		System.out.println("Cutting at 8 slices");
	}
	void box(){
		System.out.println("Put into box");
	}
}