public class Nasl2{
	public static void main(String [] args){
		One o=new One();
		Two t=new Two();
		System.out.println("One:");
		o.f();
		o.f1();
		System.out.println("Two:");
		t.f();
		t.f1();
	}
}
class One{
	String greet="student";
	void f1(){
		System.out.println("Hello "+greet);
	}
	void f(){
		System.out.println("One!");
	}	
}
class Two extends One{
	int greet=1000;
	String locale="en";
	void f(){
		System.out.println("locale="+locale+" Two! "+greet);
	}
}