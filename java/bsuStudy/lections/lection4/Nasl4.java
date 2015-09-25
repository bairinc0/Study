public class Nasl4{
	public static void main(String [] args){
		ImiGroup ig=new ImiGroup("05440",30);		
		ig.students();
		ig=new ImiGroup();
	}
}
class Group{
	int count;	
	Group(){
		System.out.println("Empty Group constructor");
	}
	Group(int c){
		System.out.println("Int Group constructor");
		count=c;
	}
	void students(){
		System.out.println("Students count="+count);
	}
}
class ImiGroup extends Group{
	String name;
	ImiGroup(){
		System.out.println("Empty Imi constructor");
	}
	ImiGroup(String name,int count){
		super(count);
		this.name=name;
	}
	void students(){
		System.out.println("Group "+name+" has count="+count);
	}
}