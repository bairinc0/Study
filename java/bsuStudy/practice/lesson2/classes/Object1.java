public class Object1{
	int i;
	public static void main(String [] args){
		Object1 obj1=new Object1();
		Object1 obj2=new Object1();
		obj1.add();
		obj1.show("Object1");
		obj2.show("Object2");
		obj2=obj1;
		obj2.add();
		obj1.show("Object1");
		obj2.show("Object2");
		obj1.i=100;
		obj1.show("Object1");
		obj2.show("Object2");
	}
	public void add(){
		i++;
	}
	public void show(String objectName){
		System.out.println(objectName+":"+i);
	}
}