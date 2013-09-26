public class ObjectInMethod{
	
	static void f(Letter y){
		y.c='Z';
	}
	public static void main(String[] args){
		Letter x=new Letter();
		x.c='a';
		System.out.println("1:"+x.c);
		f(x);
		System.out.println("1:"+x.c);
	}
} 
class Letter{	
		char c;
}